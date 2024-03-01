package com.parthesh.arrays.search;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the array elements in ascending order:");

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the target element:");
        int target = scanner.nextInt();

        int answer = binarySearch(array, target);

        if (answer == -1) {
            System.out.println("Target element is not found");
        } else {
            System.out.println("Target element is not found index: " + answer);
        }
        scanner.close();
    }

    static int binarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (target < array[mid]) {
                end = mid - 1;
            }

            if (target > array[mid]) {
                start = mid + 1;
            }

        }

        return -1;

    }

}
