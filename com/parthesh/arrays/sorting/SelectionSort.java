//maximum index placed in its correct position

package com.parthesh.arrays.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = { -10,165,20,-2,5 };

        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int[] selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int startIndex = 0;
            int endIndex = arr.length - i - 1;

            int max = getMax(arr, startIndex, endIndex);

            swap(max, endIndex, arr);

        }
        return arr;
    }

    static int getMax(int[] arr, int start, int end) {

        int max = arr[start];
        int maxIndex = start;

        for (int i = start; i <= end; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    static void swap(int first, int second, int[] array) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
