package org.example.binary.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/*
 * Date : 7th December 2023
 * Level: Medium (Leetcode : Hard)
 * Link :
 * Reference : https://leetcode.com/problems/find-target-indices-after-sorting-array/
 * Tag : #BinarySearch #slidingWindow
 * */
public class TargetIndicesAfterSortingArray {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> out = new ArrayList<>();
        // sort
        Arrays.sort(nums);
        int start = bs(nums, target, true);
        if (start == -1) {
            return out;
        }
        int end = bs(nums, target, false);
        for (int i = start; i <= end; i++) {
            out.add(i);
        }
        return out;
    }

    static int bs(int[] nums, int target, boolean firstOccurrence) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                result = mid;
                if (firstOccurrence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
