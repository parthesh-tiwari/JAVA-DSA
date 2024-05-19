package com.parthesh.recursion.levelonequestions;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(5151));
    }

    static int sumOfDigits(int n) {

        if (n == 0) {
            return 0;
        }

        int last = n % 10;
        return last + sumOfDigits(n / 10);
    }

}
