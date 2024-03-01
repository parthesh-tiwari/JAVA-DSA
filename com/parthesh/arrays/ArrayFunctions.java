package com.parthesh.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunctions {

    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    static void reverse(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            swap(arr, start, end);
            start++;
            end--;

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the array:");
        int length = scanner.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("The original array is:");
        System.out.print(Arrays.toString(array));

        reverse(array);

        System.out.print("The reversed array is:" + Arrays.toString(array));

        scanner.close();

    }

}
