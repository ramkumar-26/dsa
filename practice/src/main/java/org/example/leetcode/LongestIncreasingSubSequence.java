package org.example.leetcode;

/**
 * The type Longest increasing sub sequence.
 */
/*
 * Date : 5th January 2024
 * Week : 1
 * Level: Medium
 * Link :
 * Reference : https://leetcode.com/problems/longest-increasing-subsequence/
 * Tag : #Array #notdone #BinarySearch #DynamicProgramming
 * */
public class LongestIncreasingSubSequence {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }

    /**
     * Length of lis int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if (i == size) ++size;
        }
        return size;
    }
}
