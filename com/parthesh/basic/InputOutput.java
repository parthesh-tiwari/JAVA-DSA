package com.parthesh.basic;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        System.out.println("Welcome to code ");

        Scanner scanner = new Scanner(System.in);

        String inputtedString = scanner.nextLine();
        System.out.println(inputtedString + " is the inputted string");

        scanner.close();
    }
}
