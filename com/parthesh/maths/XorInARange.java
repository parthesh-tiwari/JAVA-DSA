//Given a range , find xors of that range
//Basically, xor returns true iff both the elements are unique

package com.parthesh.maths;

public class XorInARange {

    public static void main(String[] args) {

        int start = 3;
        int end = 9;

        int excluded = xorTillN(start - 1);

        int total = xorTillN(end);

        int ans = total ^ excluded;

        System.out.println(ans);
    }

    static int xorTillN(int end) {

        int num = end % 4;

        if (num == 0) {
            return num;
        } else if (num == 1) {
            return 1;
        } else if (num == 2) {
            return num + 1;
        }
        return 0;
    }

}