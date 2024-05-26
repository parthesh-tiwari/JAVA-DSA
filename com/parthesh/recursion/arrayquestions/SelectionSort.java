package com.parthesh.recursion.arrayquestions;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = { 5, 2, 4, 1, 2, 8 };
        selectionSort(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void selectionSort(int arr[], int row, int column, int max) {

        if (row == 0) {
            return;
        }

        if (column < row) {

            if (arr[column] > arr[max]) {
                selectionSort(arr, row - 1, column + 1, column);

            } else {

                selectionSort(arr, row - 1, column + 1, max);
            }

        } else {

            int temp = arr[column];
            arr[column] = arr[max];
            arr[max] = temp;

            selectionSort(arr, row - 1, 0, max);

        }

    }
}
