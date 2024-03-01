package com.parthesh.arrays.search;

import java.util.Scanner;

public class LinesrSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the target element:");
        int target = scanner.nextInt();

        boolean ifExists = search(array, target);

        if (ifExists) {
            System.out.println("Element exists in the array");

        } else {
            System.out.println("Element does not exist in the array");
        }

        scanner.close();
    }

    static boolean search(int[] array, int target) {

        for (int element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

}
