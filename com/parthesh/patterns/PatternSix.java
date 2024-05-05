package com.parthesh.patterns;

public class PatternSix {

    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= 2 * n - 1; row++) {

            int columnCount = row > n ? 2 * n - row : row;

            for (int space = 0; space < 2 * n - columnCount; space++) {
                System.out.print("  ");
            }

            for (int i = columnCount; i >= 1; i--) {
                System.out.print(i + " ");
            }

            for (int i = 2; i <= columnCount; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}
