// https://leetcode.com/problems/richest-customer-wealth/description/

package com.parthesh.arrays.questions;

import java.util.Scanner;

public class RichestWealthacount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int arr[][] = new int[3][3];

        for (int row = 0; row < 3; row++) {
            for (int column = 0; column < 3; column++) {
                arr[row][column] = scanner.nextInt();
            }
        }

        System.out.println("The riches wealth is:" + getRichestWealth(arr));

        scanner.close();

    }

    static int getRichestWealth(int arr[][]) {

        int richestCount = Integer.MIN_VALUE;

        for (int[] array : arr) {

            int count = 0;

            for (int element : array) {

                count += element;

            }

            if (count > richestCount) {
                richestCount = count;
            }
        }
        return richestCount;
    }
}
