package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * The type Min operations.
 */
/*
 * Date : 4th January 2024
 * Week : 1
 * Level: Medium
 * Link :
 * Reference : https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/
 * Tag : #Array #notdone
 * */
public class MinOperations {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        System.out.println(minOperations(nums));
    }

    /**
     * Min operations int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int minOperations(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int second;
        int result = 0;
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            second = entry.getValue();
            if (second == 1) {
                return -1;
            }
            if (second % 3 == 1) {
                result += (second / 3) - 1;
                result += 2;
            } else {
                result += (second / 3);
                result += ((second % 3) / 2);
            }
        }
        return result;
    }

    /**
     * Min operations 2 int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int minOperations2(int[] nums){
        Arrays.sort(nums);
        int start = 0;
        int res = 0;
        while(start < nums.length){
            int end = start;
            while(end < nums.length  && nums[start] == nums[end]){
                end++;
            }
            int count = end - start;
            if(count == 1) return -1;
            res += count / 3;
            res += (count % 3) / 2;

            if(count%3 != 0) res++;
            start = end;
        }
        return res;
    }
}

