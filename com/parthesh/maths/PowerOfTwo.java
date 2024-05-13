//Given an n, find out if the number is power of 2

package com.parthesh.maths;

public record PowerOfTwo() {

    public static void main(String[] args) {

        int n = 16;
        boolean isPowerOfTwo = n == 0 ? false : (n & (n - 1)) == 0;

        System.out.println(isPowerOfTwo);
    }

}
