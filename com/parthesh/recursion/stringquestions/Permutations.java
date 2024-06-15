package com.parthesh.recursion.stringquestions;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        String str = "ascd";
        permutations("", str);
        System.out.println(permutationsReturn("", str));
        System.out.println(permutationsCount("", str));
    }

    static void permutations(String p, String up) {

        if (up.isEmpty()) {
            System.out.println(p);
            return;

        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0, i);
            String s = p.substring(i, p.length());

            permutations(f + ch + s, up.substring(1));
        }

    }

    static ArrayList<String> permutationsReturn(String p, String up) {

        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> values = new ArrayList<String>();

        for (int i = 0; i <= p.length(); i++) {

            String s = p.substring(0, i);
            String e = p.substring(i, p.length());

            values.addAll(permutationsReturn(s + ch + e, up.substring(1)));

        }

        return values;
    }

    static int permutationsCount(String p, String up) {

        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String s = p.substring(0, i);
            String e = p.substring(i, p.length());

            count += permutationsCount(s + ch + e, up.substring(1));

        }

        return count;

    }

}
