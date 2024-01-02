package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Array to 2 d array.
 */


/*
 * Date : 2nd January 2024
 * Week : 1
 * Level: Medium
 * Link :
 * Reference : https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
 * Tag : #Array #TwoPointer #Greedy #Sorting
 * */
public class ArrayTo2DArray {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        findMatrix(nums);
    }

    /**
     * Find matrix list.
     *
     * @param nums the nums
     * @return the list
     */
    public static List<List<Integer>> findMatrix(int[] nums) {
        int freq[] = new int[nums.length + 1];

        ArrayList<List<Integer>> ans = new ArrayList<>();
        for (int c : nums) {
            if (freq[c] >= ans.size()) {
                ans.add(new ArrayList<>());
            }

            // Store the integer in the list corresponding to its current frequency.
            ans.get(freq[c]).add(c);
            freq[c]++;
        }

        return ans;
    }
}
