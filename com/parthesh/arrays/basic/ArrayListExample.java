package com.parthesh.arrays.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        System.out.println("Enter the length:");
        int length = scanner.nextInt();

        System.out.println("Enter array elements:");
        for (int i = 0; i < length; i++) {

            arrayList.add(scanner.nextInt());

        }

        System.out.println(arrayList.toString());
        scanner.close();

    }

}
