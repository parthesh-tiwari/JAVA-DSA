//https://leetcode.com/problems/flipping-an-image/description/
// Google Interview Question

package com.parthesh.maths;

import java.util.Arrays;

public class FlippingAnImage {

    public static void main(String[] args) {

        int[][] image = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };

        System.out.println(Arrays.toString(flipAnUmage(image)));

    }

    static int[][] flipAnUmage(int[][] image) {

        for (int[] row: image) {

            for (int j = 0; j < (row.length + 1) / 2; j++) {
                int temp = row[j] ^ 1;
                row[j] = row[image.length - j - 1] ^ 1;
                row[image.length - j - 1] = temp;
            }

        }
        return image;
    }

}
