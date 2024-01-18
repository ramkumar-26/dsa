package org.example.binary.search;

import java.util.Arrays;


/*
 * Date : 8th December 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/submissions/
 * Tag : #BinarySearch #sorting
 * */

/**
 * The type The k weakest rows in matrix.
 */
public class TheKWeakestRowsInMatrix {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[][] mat = {{1, 1, 0, 0, 0}, {1, 1, 1, 1, 0}, {1, 0, 0, 0, 0}, {1, 1, 0, 0, 0}, {1, 1, 1, 1, 1}};
        int k = 3;
        int[][] rowStrengths = new int[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            if (mat[i][0] != 1) {
                rowStrengths[i][0] = 0;
                rowStrengths[i][1] = i;
            } else {
                int num = bs(mat[i], 1) + 1;
                rowStrengths[i][0] = num;
                rowStrengths[i][1] = i;
            }
        }
        Arrays.sort(rowStrengths, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = rowStrengths[i][1];
        }
        System.out.println(Arrays.toString(result));
    }


    /**
     * Bs int.
     *
     * @param nums   the nums
     * @param target the target
     * @return the int
     */
    static int bs(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        int result = 0;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                result = mid;
                start = mid + 1;

            }else if(nums[mid] < target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return result;
    }
}
