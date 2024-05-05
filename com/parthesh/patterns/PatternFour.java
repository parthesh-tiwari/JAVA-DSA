package com.parthesh.patterns;

public class PatternFour {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 0; row < 2 * n; row++) {

            int columnsCount = row > n ? 2 * n - row : row;
            int spacesCount = n - columnsCount;

            for (int space = 0; space < spacesCount; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < columnsCount; col++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }
}