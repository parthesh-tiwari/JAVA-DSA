package com.parthesh.patterns;

public class PatternFive {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int i = row; i >= 1; i--) {
                System.out.print(i + " ");
            }

            for (int i = 2; i <= row; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
