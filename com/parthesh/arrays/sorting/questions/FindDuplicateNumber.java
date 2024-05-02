//https://leetcode.com/problems/find-the-duplicate-number/editorial/
//pattern - given an array with range [1,n]
//Amazon interview question

package com.parthesh.arrays.sorting.questions;

import java.util.Arrays;

public class FindDuplicateNumber {

    public static void main(String[] args) {

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(getDuplicateNumber(nums));

    }

    static int getDuplicateNumber(int[] nums) {

        int i = 0;
        int duplicate = -1;

        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }

        }

        System.out.println(Arrays.toString(nums));

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != i + 1) {
                System.out.println(i);
                duplicate = nums[j];
            }
        }

        return duplicate;
    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
