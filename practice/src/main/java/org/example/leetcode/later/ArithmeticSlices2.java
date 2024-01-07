package org.example.leetcode.later;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * The type Arithmetic slices 2.
 */
/*
 * Date : 7th January 2024
 * Week : 1
 * Level: Hard
 * Link :
 * Reference : https://leetcode.com/problems/arithmetic-slices-ii-subsequence/
 * Tag : #DP #notdone #Array
 * */
public class ArithmeticSlices2 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,10};
        System.out.println(numberOfArithmeticSlices(nums));
    }

    /**
     * Number of arithmetic slices int.
     *
     * @param nums the nums
     * @return the int
     */
    public static int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n];
        HashMap<Long, ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            long temp = nums[i];
            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<Integer>());
            }
            map.get(temp).add(i);
        }

        int sum = 0;
        for(int i = 1; i < n; i++){
            for(int j = i + 1; j < n; j++){
                long a = 2L * nums[i] - nums[j];
                if(map.containsKey(a) ){
                    for(int k : map.get(a)){
                        if(k < i){
                            dp[i][j] += dp[k][i] + 1;
                        }else{
                            break;
                        }
                    }
                }
                sum += dp[i][j];
            }
        }
        return sum;
    }
}
