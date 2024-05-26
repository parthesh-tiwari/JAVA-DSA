package com.parthesh.recursion.patternquestions;

public class Triangle {

    public static void main(String[] args) {

        triangle2(4, 0);

    }

    static void triangle1(int row, int column) {

        if (row == 0) {
            return;
        }

        if (column < row) {
            System.out.print("* ");
            triangle1(row, column + 1);
        } else {
            System.out.println();
            triangle1(row - 1, 0);
        }

    }

    static void triangle2(int row, int column) {

        if (row == 0) {
            System.out.print("* ");
            return;
        }

        if (column < row) {
            triangle2(row, column + 1);
            System.out.print("* ");
        } else {
            triangle2(row - 1, 0);
            System.out.println();
            System.out.print("* ");
        }

    }

}
