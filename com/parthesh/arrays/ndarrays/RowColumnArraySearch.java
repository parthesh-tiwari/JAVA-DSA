package com.parthesh.arrays.ndarrays;

import java.util.Arrays;

public class RowColumnArraySearch {

    public static void main(String[] args) {

        int[][] nums = {
                { 36, 37, 39, 44 },
                { 41, 42, 45, 50 },
                { 60, 66, 69, 178 },
                { 213, 555, 650, 1023 }
        };

        int target = 1023;

        System.err.println(Arrays.toString( binarySearch2dArray(nums, target)));

    }

    static int[] binarySearch2dArray(int[][] nums, int target) {

        int row = 0;
        int column = nums.length - 1;

        while (column >= 0 && row < nums.length  ) {

            if (nums[row][column] == target) {
                return new int[] { row, column };
            }

            if (nums[row][column] > target) {
                column--;
            } else {
                row++;
            }

        }
        return new int[] { -1, -1 };

    }
}