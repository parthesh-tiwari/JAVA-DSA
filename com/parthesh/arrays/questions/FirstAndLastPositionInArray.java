// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// facebook interview question


package com.parthesh.arrays.questions;


import java.util.Arrays;

public class FirstAndLastPositionInArray {

    public static void main(String[] args) {

        int[] nums = { 5, 7, 7, 7, 8, 8, 10 };
        int target = 7;

        int[] ans = { -1, -1 };

        ans[0] = searchFirstAndLastPosition(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = searchFirstAndLastPosition(nums, target, false);
        }

        System.out.println(Arrays.toString(ans));

        // return ans;
    }

    static int searchFirstAndLastPosition(int[] nums, int target, boolean searchStartIndex) {

        int start = 0;
        int end = nums.length - 1;

        int answer = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                answer = mid;
                if (searchStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            if (target < nums[mid]) {
                end = mid - 1;
            }
            if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        return answer;

    }

}
