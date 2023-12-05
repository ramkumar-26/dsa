package org.example.binary.search;


/*
 * Date : 5th December 2023
 * Level: Medium (Leetcode : Hard)
 * Link :
 * Reference : https://leetcode.com/problems/find-in-mountain-array/submissions/
 * Tag : #BinarySearch #slidingWindow
 * */

/**
 * The type Find in mountain array.
 */
public class FindInMountainArray {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,2,1};
        int target = 3;
        int peak = peakIndexInArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            System.out.println(firstTry);
            return;
        }
        System.out.println(orderAgnosticBS(arr, target, peak + 1, arr.length - 1));
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

    /**
     * Order agnostic bs int.
     *
     * @param arr    the arr
     * @param target the target
     * @param start  the start
     * @param end    the end
     * @return the int
     */
    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
