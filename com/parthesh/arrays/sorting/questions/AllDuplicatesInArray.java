//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
// pattern - an array given within the range [1,n]
// Microsoft interview question

package com.parthesh.arrays.sorting.questions;

import java.util.ArrayList;

public class AllDuplicatesInArray {

    public static void main(String[] args) {

        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        System.out.println(getRepeatedNumbers(nums));

    }

    static ArrayList<Integer> getRepeatedNumbers(int[] nums) {

        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        int i = 0;
        while (i < nums.length) {

            int correct = nums[i] - 1;

            if (nums[correct] != nums[i]) {

                swap(nums, correct, i);

            } else {
                i++;
            }

        }

        for (int j = 0; j < nums.length; j++) {

            if (j != nums[j] - 1) {
                duplicates.add(nums[j]);
            }
        }

        return duplicates;

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
