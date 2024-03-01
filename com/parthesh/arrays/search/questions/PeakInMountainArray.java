// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

package com.parthesh.arrays.search.questions;

public class PeakInMountainArray {

    public static void main(String[] args) {

        int[] array = { 1, 2, 1, 3, 5, 6, 4 };

        System.out.println(peakIndexInMountainArray(array));

    }

    static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }

        return start;
    }
}
