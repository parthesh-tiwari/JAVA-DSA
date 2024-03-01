//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
// Google , Amazon interview question

package com.parthesh.arrays.search.questions;

public class RotatedBinarySearch {

    public static void main(String[] args) {

        int[] nums = { 3, 5, 1 };
        int target = 3;

        System.out.println(findElement(nums, target));

    }

    static int findElement(int[] nums, int target) {

        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target) {
            return pivot;
        }

        if (nums[0] <= target) {
            return binarySearch(nums, target, 0, pivot);
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }

    }

    static int findPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target < nums[mid]) {
                end = mid - 1;
            } else {

                start = mid + 1;
            }

        }
        return -1;

    }

}
