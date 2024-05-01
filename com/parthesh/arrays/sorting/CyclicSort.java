//can only sort continuous arrays in order 1 to n

package com.parthesh.arrays.sorting;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {

        int[] arr = { 3, 5, 2, 1, 4 };

        System.out.println(Arrays.toString(cyclicSort(arr)));

    }

    static int[] cyclicSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {

                swap(arr, i, correct);

            } else {
                i++;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}