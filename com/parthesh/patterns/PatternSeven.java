//solved using minmum distance from the ends pattern and finally n - disatnce

package com.parthesh.patterns;

public class PatternSeven {

    public static void main(String[] args) {

        int n = 4;
        int originalN = 2 * n - 1;

        for (int row = 0; row <= 2 * n - 1; row++) {

            for (int col = 0; col <= 2 * n - 1; col++) {

                int atIndex = Math.min(Math.min(row, col), Math.min(originalN - row, originalN - col));
                System.out.print(n - atIndex + " ");

            }
            System.out.println();

        }
    }

}
