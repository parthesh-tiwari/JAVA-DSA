// https://leetcode.com/problems/find-peak-element/

package com.parthesh.arrays.search.questions;

public class FindPeakElement {

    public static void main(String[] args) {

        int[] array = { 0, 10, 5, 2 };

        System.out.println(findPeakElement(array));

    }

    static int findPeakElement(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] array, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (target < array[mid]) {
                end = mid - 1;
            }

            if (target > array[mid]) {
                start = mid + 1;
            }
        }

        return -1;
    }

}
