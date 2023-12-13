package org.example.binary.search;



/*
 * Date : 13th December 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/
 * Tag : #BinarySearch
 * */
/**
 * The type Maximum count pos and neg integer.
 */
public class MaximumCountPosAndNegInteger {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {-1, -1 , 0, 0, 0, 2};
        System.out.println(maximumCount(nums));
    }

    /**
     * Maximum count int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int maximumCount(int[] nums) {
        return Math.max(binaryPos(nums, 0, nums.length - 1), binaryNeg(nums, 0, nums.length - 1));
    }

    /**
     * Binary pos int.
     *
     * @param arr   the arr
     * @param start the start
     * @param end   the end
     * @return the int
     */
    static int binaryPos(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= 0)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return arr.length - 1 - end;
    }

    /**
     * Binary neg int.
     *
     * @param arr   the arr
     * @param start the start
     * @param end   the end
     * @return the int
     */
    static int binaryNeg(int[] arr, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < 0)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }

}
