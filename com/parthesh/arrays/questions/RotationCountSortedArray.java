// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
// an array is rotated pivot times

package com.parthesh.arrays.questions;


public class RotationCountSortedArray {

    public static void main(String[] args) {

        int array[] = { 7, 9, 11, 12, 5 };

        System.out.println(findNTimesArrayRotations(array));
    }

    static int findNTimesArrayRotations(int[] array) {
        return findPivot(array) + 1;
    }

    static int findPivot(int[] array) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && array[mid] > array[mid + 1]) {
                return mid;
            }

            if (mid > start && array[mid] < array[mid - 1]) {
                return mid - 1;
            }

            if (array[start] <= array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;

    }
}
