package org.example.array;

import java.util.ArrayList;
import java.util.List;


/**
 * The type Find target indices.
 */
/*
 * Date : 7 December 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/concatenation-of-array/
 * Tag :
 * */
public class FindTargetIndices {

    /**
     * Algorithm:
     * - Parse the array once and count how many are lesser than target and how many are equal
     * - DO NOT sort the array as we don't need it sorted.
     * Just to know how many are lesser and how many are equal. O(N) better than O(NlogN - sorting)
     * - The response list will have a size = with the number of equal elements (as their positions)
     * - Loop from smaller to smaller+equal and add the values into the list. Return the list
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums, target));
    }

    /**
     * Target indices list.
     *
     * @param nums   the nums
     * @param target the target
     * @return the list
     */
    public static List<Integer> targetIndices(int[] nums, int target) {
        int smaller = 0;
        int equal = 0;
        for (int num : nums) {
            if (num < target) {
                smaller++;
            } else if (num == target) {
                equal++;
            }
        }
        List<Integer> indices = new ArrayList<>(equal);
        for (int i = smaller; i < smaller + equal; i++) {
            indices.add(i);
        }
        return indices;
    }
}
