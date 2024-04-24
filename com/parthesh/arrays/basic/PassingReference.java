package com.parthesh.arrays.basic;

import java.util.Arrays;

public class PassingReference {

    static void change(int[] arr) {
        arr[0] = 66;

    }

    public static void main(String[] args) {

        int numbers[] = { 0, 1, 2, 3, 5, 6 };

        System.out.println(Arrays.toString(numbers));
        change(numbers); // passed the reference
        System.out.println(Arrays.toString(numbers));

    }

}
