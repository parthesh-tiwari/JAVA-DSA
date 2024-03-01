package com.parthesh.arrays.search.questions;

public class RotatedBSDuplicateValues {

    public static void main(String[] args) {

        int[] nums = { 2, 2, 9, 2 };
        int target = 9;

        System.out.println(findElement(nums, target));

    }

    static int findElement(int[] nums, int target) {

        int pivot = findPivotWithDuplicateValues(nums);

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

    static int findPivotWithDuplicateValues(int[] nums) {

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

            // Repetition of elements will impact here on the logic
            if (nums[mid] == nums[start] && nums[mid] == nums[end]) {

                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] < nums[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;

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
            }

            if (target > nums[mid]) {
                start = end + 1;
            }
        }
        return -1;
    }

}
