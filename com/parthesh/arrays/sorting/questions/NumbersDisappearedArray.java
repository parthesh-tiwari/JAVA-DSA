// /https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
//pattern - nums in [1,n] range given 
//Google interview question

package com.parthesh.arrays.sorting.questions;

import java.util.ArrayList;

public class NumbersDisappearedArray {

    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        System.out.println(findMissingNumbers(nums));

    }

    static ArrayList<Integer> findMissingNumbers(int[] array) {

        ArrayList<Integer> missingNumbers = new ArrayList<Integer>();

        int i = 0;

        while (i < array.length) {

            int correct = array[i] - 1;

            if (correct < array.length && array[correct] != array[i]) {
                swap(array, i, correct);
            } else {
                i++;
            }

        }

        for (int j = 0; j < array.length; j++) {

            if (array[j] != j + 1) {
                missingNumbers.add(j + 1);
            }

        }

        return missingNumbers;

    }

    static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
