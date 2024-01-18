package org.example.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


/*
 * Date : 10th December 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/intersection-of-two-arrays/
 * Tag : #BinarySearch #Set #HashSet
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
        Set<Integer> set1 = new HashSet<>();
        for(int num : arr1){
            set1.add(num);
        }
        Set<Integer> set2 = new HashSet<>();
        for(int num : arr2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        int[] res = new int[set2.size()];
        int index = 0;
        for(Integer n : set2){
            res[index++] = n;
        }
        System.out.println(Arrays.toString(res));
    }
}
