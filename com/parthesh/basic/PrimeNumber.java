package com.parthesh.basic;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        System.out.println("number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(number);

        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i * i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime);

        sc.close();
    }
}
