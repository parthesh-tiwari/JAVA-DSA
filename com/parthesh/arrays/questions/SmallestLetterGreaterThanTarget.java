// https://leetcode.com/problems/find-smallest-letter-greater-than-target

package com.parthesh.arrays.questions;


public class SmallestLetterGreaterThanTarget {

    public static char main(String[] args) {

        char[] letters = { 'c', 'd', 'e', 'f', 'g', 'h' };
        char target = 'a';

        char answer = findGreatestElement(letters, target);
        return answer;

    }

    static char findGreatestElement(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {

                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }

}
