package com.parthesh.arrays.search;

import java.util.Scanner;

public class StringSearch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String:");
        String string = scanner.nextLine();

        System.out.println("Enter the target charecter:");
        char target = scanner.next().charAt(0);

        boolean doesExist = search(string, target);

        if (doesExist) {
            System.out.println("Charecter exists in the string");
        } else {
            System.out.println("Charecter does not exist the in string");
        }

        scanner.close();

    }

    static boolean search(String string, char target) {

        char[] array = string.toCharArray();

        for (char element : array) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

}

