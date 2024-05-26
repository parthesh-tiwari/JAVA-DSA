package com.parthesh.recursion.arrayquestions;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        int[] arr = { 6, 7, 8, 1, 2, 3, 4, 5, };
        int target = 55;

        System.out.println(search(arr, target, 0, arr.length - 1));

    }

    static int search(int[] arr, int target, int start, int end) {

        if (end < start) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {

            if (arr[start] <= target && arr[mid] >= target) {

                return search(arr, target, start, mid - 1);

            } else {
                return search(arr, target, mid + 1, end);
            }
        } else if (target >= arr[mid] && target <= arr[end]) {

            return search(arr, target, mid + 1, end);
        } else {

            return search(arr, target, start, mid - 1);
        }

    }
}
