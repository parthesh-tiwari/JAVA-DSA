//Amaozon interview question based on bit manipulation
//complexity O(log n)

package com.parthesh.maths;

public class MagicNumber {

    public static void main(String[] args) {

        int n = 10;
        int ans = 0;
        int base = 5;

        while (n > 0) {

            int bit = n & 1;
            ans += base * bit;

            n = n >> 1;
            base = base * 5;
        }

        System.out.println(ans);

    }

}
