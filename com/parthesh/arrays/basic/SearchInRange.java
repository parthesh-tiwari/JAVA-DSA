package com.parthesh.arrays.basic;

import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of an array:");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter start target:");
        int target = scanner.nextInt();

        System.out.println("Enter start point range:");
        int start = scanner.nextInt();

        System.out.println("Enter end point range:");
        int end = scanner.nextInt();

        boolean doesExists = searchInRange(array, target, start, end);

        if (doesExists) {
            System.out.println("Target exist in range");
        } else {
            System.out.println("Target does not exist in range");
        }

        scanner.close();
    }

    static boolean searchInRange(int[] array, int target, int start, int end) {

        if (start > end) {
            return false;
        }

        for (int i = start; i <= end; i++) {
            if (array[i] == target) {
                return true;
            }
        }
        return false;
    }
}
