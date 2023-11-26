package org.example.binary.search;


/**
 * The type Find next greater char.
 */
/*
 * Date : 26 November 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * Tag : #BinarySearch
 * */
public class FindNextGreaterChar {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'z'};
        System.out.println( nextGreatestLetter(arr, 'l'));
    }

    /**
     * Next greatest letter char.
     *
     * @param arr    the arr
     * @param target the target
     * @return the char
     */
    public static char nextGreatestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
