package com.parthesh.recursion.stringquestions;

import java.util.ArrayList;

public class Subsequences {

    public static void main(String[] args) {
        String seq = "abc";
        printSubsequences("", seq);
        System.out.println(printSubsequencesReturn("", seq));
    }

    static void printSubsequences(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        printSubsequences(p + up.charAt(0), up.substring(1));
        printSubsequences(p, up.substring(1));

    }

    static ArrayList<String> printSubsequencesReturn(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        ArrayList<String> leftAns = printSubsequencesReturn(p + up.charAt(0), up.substring(1));

        ArrayList<String> rightAns = printSubsequencesReturn(p, up.substring(1));

        leftAns.addAll(rightAns);
        return leftAns;

    }

}
