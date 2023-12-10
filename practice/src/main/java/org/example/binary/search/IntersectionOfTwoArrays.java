package org.example.binary.search;

import java.util.*;

/*
 * Date : 10th December 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/intersection-of-two-arrays/
 * Tag : #BinarySearch #Sorting
 * */
/**
 * The type Intersection of two arrays.
 */
public class IntersectionOfTwoArrays {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr2);
        for(int num : arr1){
            if(set.contains(num)) continue;
            if(bs(arr2, num)){
                set.add(num);
            }
        }
        int i = 0;
        int[] result = new int[set.size()];
        for (Integer num : set) {
            result[i++] = num;
        }
        System.out.println(Arrays.toString(result));
    }

    /**
     * Bs boolean.
     *
     * @param arr    the arr
     * @param target the target
     * @return the boolean
     */
    static boolean bs(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) return true;
            if(target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return false;
    }
}
