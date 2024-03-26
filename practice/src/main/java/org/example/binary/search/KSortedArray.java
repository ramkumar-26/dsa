package org.example.binary.search;

import java.util.Arrays;

/*
 * Date : 15 February 2024
 * Level: Medium (Tricky)
 * Link :
 * Reference : https://www.geeksforgeeks.org/problems/k-sorted-array1610/1?page=1&category=Binary%20Search&sortBy=difficulty
 * Tag : #BinarySearch
 * */

/**
 * The type K sorted array.
 */
public class KSortedArray {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {3, 2, -1, 5, 6, 4};
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        System.out.println(isItKSorted(arr, sortedArr, 2));
    }

    /**
     * Is it k sorted string.
     *
     * @param arr       the arr
     * @param sortedArr the sorted arr
     * @param k         the k
     * @return the string
     */
    private static String isItKSorted(int[] arr, int[] sortedArr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int targetIndex = Arrays.binarySearch(sortedArr, arr[i]);
            if(Math.abs(targetIndex - i) > k){
                return "No";
            }
        }
        return "Yes";
    }

}
