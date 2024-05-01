// j counter sorts the previus array than itself

package com.parthesh.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(Arrays.toString(insertionSort(arr)));

    }

    static int[] insertionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j] > arr[j - 1]) {
                    break;
                }

                if (arr[j] < arr[j - 1]) {
                    swap(j, j - 1, arr);
                }
            }
        }
        return arr;
    }

    static void swap(int first, int second, int[] array) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
