package org.example.binary.search;



/*
 * Date : 29 November 2023
 * Level: Easy (Leetcode : Medium)
 * Link :
 * Reference : https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/
 * Tag : #BinarySearch #slidingWindow
 * */

/**
 * The type Peak index.
 */
public class PeakIndex {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
            int[] arr =  {0,10,5,2};
        System.out.println(peakIndexInArray(arr));
    }

    /**
     * Peak index in array int.
     *
     * @param arr the arr
     * @return the int
     */
    static int peakIndexInArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in desc part of array
                //this may be ans but look at left
                //this is y end != mid - 1
                end = mid;
            }else{
                //you are in asc part of array
                start = mid + 1; // because we know mid + 1 > mid element
            }
        }
        // in the end, start == end & pointing to the largest num
        // start and ed are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element that is the max
        return start; // or return end
    }
}
