package org.example.sorting;

import java.util.Arrays;



/*
 * Date : 26 March 2024
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/sort-colors/submissions/
 * Tag : #BubbleSort
 * */
/**
 * The type Bubble sort.
 */
public class BubbleSort {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3};
        bubble(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Bubble.
     *
     * @param arr the arr
     * @param n   the n
     */
    static void bubble(int[] arr, int n) {
        boolean swapped = false;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }
}

