package org.example.array;

/**
 * The type Array concatenation.
 */
/*
 * Date : 9 November 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/concatenation-of-array/
 * Tag : ArrayConcatenation
 * */
public class ArrayConcatenation {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        getConcatenation(nums);
    }

    /**
     * Get concatenation int [ ].
     *
     * @param nums the nums
     * @return the int [ ]
     */
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int index = 0;
        for(int i=0;i<ans.length;i++){
            if(index == nums.length){
                index = 0;
            }
            ans[i] = nums[index++];
        }
        return ans;

    }
}
