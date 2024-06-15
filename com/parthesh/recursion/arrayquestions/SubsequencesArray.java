package com.parthesh.recursion.arrayquestions;

import java.util.ArrayList;

public class SubsequencesArray {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 6, 7 };
        int length = arr.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        // printSubSequences(arr, 0, ans, length);
        printSubSequencesSum(arr, 0, ans, length, 0, 7);
        // printOneSubSequenceSum(arr, 0, ans, length, 0, 4);
        // System.out.println(getSubsequencesCount(arr, 0, length));
        System.out.println(getSubsequencesCountSum(arr, 0, length, 0, 4));
    }

    static void printSubSequences(int[] arr, int index, ArrayList<Integer> ans, int n) {

        if (index == arr.length) {
            System.out.println(ans);
            return;
        }

        int currentNumber = arr[index];

        ans.add(currentNumber);

        printSubSequences(arr, index + 1, ans, n);

        ans.remove(ans.size() - 1);

        printSubSequences(arr, index + 1, ans, n);

    }

    static void printSubSequencesSum(int[] arr, int index, ArrayList<Integer> ans, int n, int sum, int requiredSum) {

        if (index == arr.length) {
            if (sum == requiredSum) {
                System.out.println(ans);
            }
            return;
        }

        int currentNumber = arr[index];

        ans.add(currentNumber);
        sum += currentNumber;

        printSubSequencesSum(arr, index + 1, ans, n, sum, requiredSum);

        ans.remove(ans.size() - 1);
        sum -= currentNumber;

        printSubSequencesSum(arr, index + 1, ans, n, sum, requiredSum);

    }

    static boolean printOneSubSequenceSum(int[] arr, int index, ArrayList<Integer> ans, int n, int sum,
            int requiredSum) {

        if (index == arr.length) {
            if (sum == requiredSum) {
                System.out.println(ans);
                return true;
            }
            return false;
        }

        int currentNumber = arr[index];

        ans.add(currentNumber);
        sum += currentNumber;

        boolean isPrintedInclude = printOneSubSequenceSum(arr, index + 1, ans, n, sum, requiredSum);

        if (isPrintedInclude) {
            return true;
        }

        ans.remove(ans.size() - 1);
        sum -= currentNumber;

        boolean isPrintedExclude = printOneSubSequenceSum(arr, index + 1, ans, n, sum, requiredSum);

        if (isPrintedExclude) {
            return true;
        }

        return false;

    }

    static int getSubsequencesCount(int[] arr, int index, int n) {

        if (index == arr.length) {
            return 1;
        }

        int includeCount = getSubsequencesCount(arr, index + 1, n);
        int rightCount = getSubsequencesCount(arr, index + 1, n);

        return includeCount + rightCount;

    }

    static int getSubsequencesCountSum(int[] arr, int index, int n, int sum, int requiredSum) {

        if (index == arr.length) {
            if (sum == requiredSum) {
                return 1;
            } else {
                return 0;
            }
        }

        int currentNumber = arr[index];

        sum += currentNumber;

        int leftCount = getSubsequencesCountSum(arr, index + 1, n, sum, requiredSum);

        sum -= currentNumber;

        int rightCount = getSubsequencesCountSum(arr, index + 1, n, sum, requiredSum);

        return leftCount + rightCount;
    }

}
