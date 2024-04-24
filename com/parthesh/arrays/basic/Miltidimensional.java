package com.parthesh.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Miltidimensional {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int array[][] = new int[3][3];

        for (int row = 0; row < array.length; row++) {

            for (int column = 0; column < array[row].length; column++) {

                array[row][column] = scanner.nextInt();

            }
        }

        for (int[] element : array) {
            System.out.println(Arrays.toString(element));
        }

        scanner.close();

    }
}
