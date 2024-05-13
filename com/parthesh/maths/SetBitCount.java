//Given a number n , find the number of set bits in it
//Complexity O(log n)

package com.parthesh.maths;

public class SetBitCount {

    public static void main(String[] args) {

        int n = 851651;
        int count = 0;
        System.out.println(Integer.toBinaryString(n));

        while (n > 0) {
            count++;
            n = n & (n - 1);
        }
        System.out.println(count);

    }

}
