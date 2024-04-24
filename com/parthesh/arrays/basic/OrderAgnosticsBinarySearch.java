package com.parthesh.arrays.basic;

import java.util.Scanner;

public class OrderAgnosticsBinarySearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int length = scanner.nextInt();

        int[] array = new int[length];

        System.out.println("Enter the array elements in descending order:");

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the target element:");
        int target = scanner.nextInt();

        int answer = orderAgnosticsBinarySearch(array, target);

        if (answer == -1) {
            System.out.println("Target element is not found");
        } else {
            System.out.println("Target element is not found index: " + answer);
        }
        scanner.close();

    }

    static int orderAgnosticsBinarySearch(int[] array, int target) {

        int start = 0;
        int end = array.length - 1;
        boolean isDesc = array[end] < array[start];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (isDesc) {

                if (target > array[mid]) {
                    end = mid - 1;
                }

                if (target < array[mid]) {
                    start = mid + 1;
                }

            } else {
                if (target < array[mid]) {
                    end = mid - 1;
                }

                if (target > array[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
