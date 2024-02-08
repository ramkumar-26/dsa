package org.example.binary.search;

import java.util.Arrays;

/*
 * Date : 28 November 2023
 * Level: Easy (Leetcode : Medium)
 * Link :
 * Reference : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * Tag : #BinarySearch
 * */

/*
 * Date : 8 February 2023
 * Level: Easy
 * Link :
 * Reference : https://www.geeksforgeeks.org/problems/find-first-and-last-occurrence-of-x0849/1?page=1&category=Binary%20Search&difficulty=Easy&sortBy=submissions
 * Tag : #BinarySearch
 * */



/**
 * The type First and last position.
 */
public class FirstAndLastPosition {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = {-1, -1};
        int start = search(nums, target, true);
        ans[0] = start;
        if( ans[0] != -1) {
            int end = search(nums, target, false);
            ans[1] = end;
        }
        System.out.println(Arrays.toString(ans));
    }


    /**
     * Search int.
     *
     * @param nums                the nums
     * @param target              the target
     * @param isFindingStartIndex the is finding start index
     * @return the int
     */
    static int search(int[] nums, int target, boolean isFindingStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid+1;
            }else{
                ans = mid;
                if(isFindingStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
