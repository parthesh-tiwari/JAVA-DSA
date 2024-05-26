package com.parthesh.recursion.arrayquestions;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = { 5, 2, 4, 1, 2, 8 };
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));

    }

    static void bubbleSort(int[] arr, int row, int column) {

        if (row == 0) {
            return;
        }

        if (column < row) {

            if (arr[column] > arr[column + 1]) {

                int temp = arr[column];
                arr[column] = arr[column + 1];
                arr[column + 1] = temp;

                bubbleSort(arr, row, column + 1);

            } else {

                bubbleSort(arr, row, column + 1);
            }

        } else {
            bubbleSort(arr, row - 1, 0);
        }

    }

}
