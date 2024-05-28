//Merge sort using recursion
//Time complexity: O(n * log(n))

package com.parthesh.recursion.arrayquestions;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = { 6, 4, 3, 2, 5, 1, 8, 9, 9 };
        // arr = mergeSort(arr);
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] leftPart = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] rightPart = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(leftPart, rightPart);

    }

    static void mergeSortInPlace(int[] arr, int start, int end) {

        if (end - start == 1) {
            return;
        }

        int mid = start + (end - start) / 2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);

    }

    static int[] merge(int[] first, int[] second) {

        int[] ans = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {

            if (first[i] < second[j]) {
                ans[k] = first[i];
                i++;
            } else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            ans[k] = second[j];
            j++;
            k++;
        }

        return ans;

    }

    static void mergeInPlace(int[] arr, int start, int mid, int end) {

        int[] ans = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {

            if (arr[i] < arr[j]) {
                ans[k] = arr[i];
                i++;
            } else {
                ans[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            ans[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            ans[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < ans.length; l++) {
            arr[start + l] = ans[l];
        }

    }

}
