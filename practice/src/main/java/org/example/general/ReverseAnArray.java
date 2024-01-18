package org.example.general;

import java.util.Arrays;

/**
 * The type Reverse an array.
 */
/*
 * Date : 8 November 2023
 * Level: Easy
 * Link :
 * Reference :
 * Tag : #reverseAnArray #whileLoop
 * */
public class ReverseAnArray {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start++, end--);
        }
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Swap.
     *
     * @param arr    the arr
     * @param index1 the index 1
     * @param index2 the index 2
     */
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
