//largest element bubbles up to the last index

package com.parthesh.arrays.sorting;

import java.util.Arrays;

class BubbleSort {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    static int[] bubbleSort(int[] arr) {

        boolean swapped = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(j, j - 1, arr);
                    swapped = true;
                }
            }
            if (!swapped) {
                return arr;
            }
        }
        return arr;
    }

    static void swap(int first, int second, int[] arr) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
