package com.parthesh.basic;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number to check if it is armstrong");

        Scanner scanner = new Scanner(System.in);
        int actulNumber = 0;
        int number = scanner.nextInt();

        actulNumber = number;

        int sum = 0;
        boolean isArmstrong = false;

        while (number > 0) {
            int remainder = number % 10;
            sum += remainder * remainder * remainder;
            number /= 10;
        }

        if (sum == actulNumber) {
            isArmstrong = true;
        }

        System.out.println(isArmstrong);
        sum = 0;
        actulNumber = 0;
        scanner.close();
    }
}
