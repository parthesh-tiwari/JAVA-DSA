package com.parthesh.recursion.stringquestions;

public class SkipString {

    public static void main(String[] args) {

        skipString("", "abcajpfapplehue");
        System.out.println(skipStringReturn("", "abcajpfapplehue"));
    }

    static void skipString(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        if (up.startsWith("apple")) {
            skipString(p, up.substring(5));
        } else {
            skipString(p + up.charAt(0), up.substring(1));
        }

    }

    static String skipStringReturn(String p, String up) {

        if (up.isEmpty()) {
            return p;
        }

        if (up.startsWith("apple")) {
            return skipStringReturn(p, up.substring(5));
        } else {
            return skipStringReturn(p + up.charAt(0), up.substring(1));
        }
    }

}
