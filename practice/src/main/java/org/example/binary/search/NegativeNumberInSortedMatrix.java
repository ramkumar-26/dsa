package org.example.binary.search;


/*
 * Date : 5th December 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
 * Tag : #BinarySearch
 * */

/**
 * The type Negative number in sorted matrix.
 */
public class NegativeNumberInSortedMatrix {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[][] grid = {{}, {}, {}, {}};
        int count = 0;
        int n = grid[0].length;
        for(int i=0;i<grid.length;i++){
            count += (n - binarySearch(grid[i]));
        }
        System.out.println(count);
    }

    /**
     * Binary search int.
     *
     * @param arr the arr
     * @return the int
     */
    static int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > -1){
                start = mid + 1;
            }else if(arr[mid] <= -1){
                end = mid - 1;
            }
        }
        return start;
    }
}
