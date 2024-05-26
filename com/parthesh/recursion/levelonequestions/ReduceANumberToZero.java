//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
//pattern: returning the count when steps

package com.parthesh.recursion.levelonequestions;

public class ReduceANumberToZero {
    public static void main(String[] args) {

        int num = 123;

        System.out.println(numberOfSteps(num, 0));

    }

    static int numberOfSteps(int num, int count) {

        if (num == 0) {
            return count;
        }

        if (num % 2 == 0) {

            return numberOfSteps(num / 2, ++count);

        } else {

            return numberOfSteps(num - 1, ++count);

        }

    }

}
