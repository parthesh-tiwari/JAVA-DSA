//Pick a pivot and put it int its correct place 
//Divide and conquer algorithm
//Time complexity: O(n log(n))

package com.parthesh.recursion.arrayquestions;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = { 6, 4, 3, 2, 5, 1, 8, 9, };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = getPartitionIndex(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    static int getPartitionIndex(int[] arr, int low, int high) {
        int pivot = arr[low];
        int start = low;
        int end = high;

        while (start < end) {
            while (start <= high && arr[start] <= pivot) {
                start++;
            }

            while (end >= low && arr[end] > pivot) {
                end--;
            }

            if (start < end) {
                swap(arr, start, end);
            }
        }

        swap(arr, low, end);

        return end;
    }

    static void swap(int arr[], int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
