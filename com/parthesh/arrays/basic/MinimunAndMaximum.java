package com.parthesh.arrays.basic;

import java.util.Scanner;

public class MinimunAndMaximum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("The minumum element of the array is: " + min(array));

        System.out.println("The maximum element of the array is: " + max(array));

        scanner.close();

    }

    static int min(int[] array) {

        int min = array[0];

        for (int element : array) {

            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    static int max(int[] array) {
        int max = array[0];

        for (int element : array) {

            if (element > max) {
                max = element;
            }
        }
        return max;
    }

}
