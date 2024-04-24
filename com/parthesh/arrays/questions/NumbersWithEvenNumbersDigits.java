// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package com.parthesh.arrays.questions;


public class NumbersWithEvenNumbersDigits {

    public static void main(String[] args) {

        int evenNumberCount = 0;

        int[] nums = { 12, 345, 2, 6, 7896 };

        for (int number : nums) {
            if (isEvenDigitCount(number)) {
                evenNumberCount++;
            }
        }

        System.out.println("Numbers with even numbers count: " + evenNumberCount);

    }

    static boolean isEvenDigitCount(int number) {

        if (countDigits(number) % 2 == 0) {
            return true;
        }
        return false;
    }

    static int countDigits(int number) {

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

}
