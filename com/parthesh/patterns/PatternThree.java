package com.parthesh.patterns;

public class PatternThree {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row <= 2 * n - 1; row++) {

            int columnsCount = row > n ? 2 * n - row : row;

            for (int col = 1; col <= columnsCount; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}