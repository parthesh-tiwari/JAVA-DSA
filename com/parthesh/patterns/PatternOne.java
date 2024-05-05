
/*
  Steps to solve these questions: 
       1. outer loop length is number of lines to be printed(rows)
       2.For each row identify the:
            - Number of columns in each row
            - Pattern to print like chars, numbers or alphabets
       3.Try to find the formula relating rows and columns

 */

package com.parthesh.patterns;

public class PatternOne {

    public static void main(String[] args) {

        int number = 16;

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");
            }
            System.out.println();

        }

    }

}
