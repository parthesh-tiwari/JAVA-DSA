package com.parthesh.recursion.levelonequestions;

public class ProductOfDigits {

    public static void main(String[] args) {

        System.out.println(getProductOfDigits(12805));

    }

    static int getProductOfDigits(int n) {

        if (n == 0) {
            return 1;
        }

        int last = n % 10;
        return last * getProductOfDigits(n / 10);

    }
}
