package com.parthesh.arrays.ndarrays;

import java.util.Arrays;

public class SortedMatrixSearch {

    public static void main(String[] args) {

        int[][] matrix = {
                { 36, 37, 39, 44 },
                { 41, 42, 45, 50 },
                { 60, 66, 69, 178 },
                { 213, 555, 650, 1023 }
        };

        int target = 105;
        System.out.println((Arrays.toString(search(matrix, target))));

    }

    static int[] search(int[][] matrix, int target) {

        int cols = matrix[0].length;
        int rows = matrix.length;

        if (cols == 0 || rows == 0) {
            return new int[] { -1, -1 };
        }

        if (rows == 1) {
            return binarySearchInMatrix(matrix, 0, 0, cols, target);
        }

        int rStart = 0;
        int rEnd = rows;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {

            int rMid = rStart + (rEnd - rStart) / 2;

            if (matrix[rMid][cMid] == target) {
                return new int[] { rMid, cMid };
            }

            if (matrix[rMid][cMid] < target) {
                rStart = rMid;
            } else {
                rEnd = rMid;
            }

        }

        if (matrix[rStart - 1][cMid] == target) {
            return new int[] { rStart, cMid };
        }

        if (matrix[rStart][cMid] == target) {
            return new int[] { rStart + 1, cMid };
        }

        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearchInMatrix(matrix, rStart, 0, cMid - 1, target);
        }

        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearchInMatrix(matrix, rStart, cMid + 1, cols - 1, target);
        }

        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearchInMatrix(matrix, rStart + 1, 0, cMid - 1, target);
        }

        else {
            return binarySearchInMatrix(matrix, rStart + 1, cMid + 1, cols, target);
        }

    }

    static int[] binarySearchInMatrix(int[][] matrix, int row, int cStart, int cEnd, int target) {

        while (cStart <= cEnd) {
            int cMid = cStart + (cEnd - cStart) / 2;

            if (matrix[row][cMid] == target) {

                return new int[] { row, cMid };
            }

            if (matrix[row][cMid] < target) {
                cStart = cMid + 1;
            } else {
                cEnd = cMid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

}
