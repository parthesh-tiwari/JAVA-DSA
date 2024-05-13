//Given a number base and power p , find base^p
//works in O(log power) time

package com.parthesh.maths;

public class FindExponent {

    public static void main(String[] args) {

        int base = 55;
        int power = 2;

        int ans = 1;

        while (power > 0) {

            if ((power & 1) == 1) {
                ans *= base;
            }

            power >>= 1;
            base *= base;
        }

        System.out.println(ans);

    }

}
