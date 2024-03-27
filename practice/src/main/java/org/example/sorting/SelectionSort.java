package org.example.sorting;

import java.util.Arrays;

/**
 * The type Selection sort.
 */
public class SelectionSort {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Selection.
     *
     * @param arr the arr
     */
    static void selection(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int last = n - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for(int i=start;i<=end;i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    /**
     * Swap.
     *
     * @param arr    the arr
     * @param first  the first
     * @param second the second
     */
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
