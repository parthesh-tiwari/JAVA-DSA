//leetcode.com/problems/missing-number/
//pattern: an array nums containing n distinct numbers in the range [0, n]

package com.parthesh.arrays.sorting.questions;

public class MissingNumbers {

    public static void main(String[] args) {

        int[] nums = { 3, 0, 1 };
        int missing = getMissingNumber(nums);

        System.out.println(missing);

    }

    static int getMissingNumber(int[] nums) {

        int i = 0;
        int currentZeroIndex = 0;
        boolean zeroFound = false;

        while (i < nums.length) {

            if (nums[i] == 0) {
                zeroFound = true;
                currentZeroIndex = i;
                i++;
                continue;
            } else {

                int correct = nums[i] - 1;

                if (nums[i] != nums[correct]) {

                    if (i == currentZeroIndex) {
                        currentZeroIndex = correct;
                    }

                    if (correct == currentZeroIndex) {
                        currentZeroIndex = i;
                    }

                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;

                } else {
                    i++;
                }

            }

        }
        return zeroFound ? currentZeroIndex + 1 : currentZeroIndex;
    }

}
