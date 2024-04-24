// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//Google interview question - 😮😮

package com.parthesh.arrays.questions;


public class SplitArrayLargestSum {

    public static void main(String[] args) {

        int[] nums = { 7, 2, 5, 10, 8 };
        int k = 2;

        findLargetsSplitSum(nums, k);

    }

    public static int findLargetsSplitSum(int[] nums, int k) {

        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {

            start = Math.max(start, nums[i]);
            end += nums[i];

        }

        return getLargestSplitSum(start, end, k, nums);
    }

    public static int getLargestSplitSum(int start, int end, int k, int[] nums) {

        int sum = 0;
        int pieces = 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (end == mid) {
                break;
            }

            for (int i = 0; i < nums.length; i++) {

                if (sum + nums[i] > mid) {

                    sum = 0;
                    pieces++;
                }

                sum += nums[i];

            }

            if (pieces <= k) {
                pieces = 1;
                sum = 0;
                end = mid;
            } else {
                pieces = 1;
                sum = 0;
                start = mid + 1;
            }

        }
        return end;
    }

}
