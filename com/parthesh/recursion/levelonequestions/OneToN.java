package com.parthesh.recursion.levelonequestions;

public class OneToN {

    public static void main(String[] args) {

        print1ToN(5);
        printNTo1(5);

    }

    static void printNTo1(int n) {

        if (n <= 0) {
            return;
        }

        System.out.println(n);
        printNTo1(n - 1);
    }

    static void print1ToN(int n) {

        if (n <= 0) {
            return;
        }

        print1ToN(n - 1);
        System.out.println(n);
    }

}
