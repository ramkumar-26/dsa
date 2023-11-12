package org.example.array;

/*
 * Date : 9 November 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/concatenation-of-array/
 * Tag : ArrayConcatenation
 * */
public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5};
        getConcatenation(nums);
    }
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
