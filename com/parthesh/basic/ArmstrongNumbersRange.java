package com.parthesh.basic;

import java.util.Scanner;

public class ArmstrongNumbersRange {

    static boolean checkArmstrong(int numberinput) {

        int number = numberinput;
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {

            int remainder = number % 10;
            sum += remainder * remainder * remainder;

            number /= 10;
        }

        return sum == originalNumber;

    }

    public static void main(String[] args) {

        System.out.println("Enter upper band of range: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < number; i++) {
            if (checkArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        scanner.close();

    }
}
