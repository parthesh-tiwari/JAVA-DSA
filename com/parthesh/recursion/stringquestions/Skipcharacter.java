
package com.parthesh.recursion.stringquestions;

public class Skipcharacter {

    public static void main(String[] args) {

        String str = "aanfdkjdncaafdj";
        skip("", str);
        System.out.println(skipWithReturingString("", str));

    }

    static void skip(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }

    }

    static String skipWithReturingString(String p, String up) {

        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skipWithReturingString(p, up.substring(1));
        } else {
            return ch + skipWithReturingString(p + ch, up.substring(1));
        }

    }

}