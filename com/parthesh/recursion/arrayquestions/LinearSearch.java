package com.parthesh.recursion.arrayquestions;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = { 2, 3, 4, 5, 7, 8, 4 };
        int target = 4;
        ArrayList<Integer> answerList = new ArrayList<Integer>();

        System.out.println(recursionSearchAllOccurences(arr, target, 0, answerList));

        System.out.println(findAllOccurences2(arr, target, 0));
    }

    static boolean recursionSearch(int[] arr, int target, int index) {

        if (index == arr.length) {
            return false;
        }

        return arr[index] == target || recursionSearch(arr, target, index + 1);

    }

    static int recursionSearchIndex(int[] arr, int target, int index) {

        if (index == arr.length) {
            return -1;
        }

        if (arr[index] == target) {
            return index;
        }

        return recursionSearchIndex(arr, target, index + 1);

    }

    static ArrayList<Integer> recursionSearchAllOccurences(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {
            list.add(index);
        }

        return recursionSearchAllOccurences(arr, target, index + 1, list);

    }

    static ArrayList<Integer> findAllOccurences2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (index == arr.length) {
            return list;
        }

        if (arr[index] == target) {

            list.add(index);
        }

        ArrayList<Integer> prevAns = findAllOccurences2(arr, target, index + 1);

        list.addAll(prevAns);

        return list;
    }

}
