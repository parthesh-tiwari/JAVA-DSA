// https://leetcode.com/problems/set-mismatch/description/
//pattern - integers from [1,n] indicating cyclic sort

package com.parthesh.arrays.sorting.questions;

public class SetMismatch {

    public static void main(String[] args) {

        int[] nums = { 1, 1 };

        System.out.println(getError(nums));

    }

    static int[] getError(int[] nums) {

        int i = 0;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[correct] != nums[i]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {

            if (nums[j] - 1 != j) {

                return new int[] { nums[j], j + 1 };
            }
        }

        return new int[] {};

    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
