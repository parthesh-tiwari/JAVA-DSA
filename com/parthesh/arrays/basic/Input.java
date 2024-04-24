package com.parthesh.arrays.basic;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5]; // created in heap memory

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = scanner.nextInt();

        }

        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }

}
