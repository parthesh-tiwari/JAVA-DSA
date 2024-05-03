//https://leetcode.com/problems/first-missing-positive/description/
// pattern - O(1) space and O(N) time and sequence in test cases
// Amazon Interview question

package com.parthesh.arrays.sorting.questions;

public class FirstMissingPositive {

    public static void main(String[] args) {

        int[] nums = { 0 };

        System.out.println(getMissingPositive(nums));

    }

    static int getMissingPositive(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] > 0 && nums[i] < nums.length && nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }

        }

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != j + 1) {
                return j + 1;
            }

        }

        return nums[nums.length - 1] + 1;

    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
