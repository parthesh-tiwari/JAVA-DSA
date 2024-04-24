// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
//amazon interview question

package com.parthesh.arrays.questions;


public class BinarySearchInfiniteArray {

    public static void main(String[] args) {

        int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;

        System.out.println(findAnswer(arr, target));
    }

    // instead of dividing the array down into halfes , as we do not know the size
    // of the array , we will reverse the approach and double the size of the array
    // selected - will be completed in O(log n)

    static int findAnswer(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarySearch(arr, target, start, end);

    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            }

            if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
