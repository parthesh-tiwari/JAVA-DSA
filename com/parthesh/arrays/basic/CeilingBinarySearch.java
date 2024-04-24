package com.parthesh.arrays.basic;

import java.util.Scanner;

public class CeilingBinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the target element:");
        int target = scanner.nextInt();

        System.out.println("The ceiling of the array is: " + binarySearch(array, target));

        scanner.close();
    }

    static int binarySearch(int[] array, int target) {

        if (target > array[array.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return array[mid];
            }

            if (target < array[mid]) {
                end = mid - 1;
            }

            if (target > array[mid]) {
                start = mid + 1;
            }
        }

        // retuern the ceiling value
        return array[start];
    }
}
