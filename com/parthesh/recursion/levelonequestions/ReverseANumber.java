
package com.parthesh.recursion.levelonequestions;

public class ReverseANumber {

    public static void main(String[] args) {
        int number = 12345;
        int digits = (int) Math.log10(number) + 1;
        System.out.println(reverse(number, digits));

    }

    static int reverse(int number, int digits) {

        if (number == 0) {
            return 0;
        }
        int powerBase = (int) Math.pow(10, digits - 1);

        int remainder = number % 10;
        return remainder * powerBase + reverse(number / 10, digits - 1);

    }

}
