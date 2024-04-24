// https://leetcode.com/problems/find-in-mountain-array/
// Leetcode HARD😎😎

package com.parthesh.arrays.questions;


public class FindInMountainArray {

    public static void main(String[] args) {

        int[] array = { 0, 5, 3, 1 };
        int target = 1;

        System.out.println(findElement(array, target));

    }

    static int findElement(int[] nums, int target) {
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

        int peak = start;
        int leftResult = binarySearch(nums, target, 0, peak);
        if (leftResult != -1) {
            return leftResult;
        }

        // better solution approach: use single function with order agnostic binary
        // search algorithm
        int rightResult = binarySearchDescending(nums, target, peak + 1, nums.length - 1);

        return rightResult;
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

    static int binarySearchDescending(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

}
