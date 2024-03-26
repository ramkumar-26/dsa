package org.example.array;

import java.util.Arrays;
import java.util.HashMap;

/*
 * Date : 15 February 2024
 * Level: Easy
 * Link :
 * Reference : https://www.geeksforgeeks.org/problems/array-subset-of-another-array2317/1?page=1&category=Binary%20Search&sortBy=difficulty
 * Tag : #HashMap #Subset #Arrays
 * */
/**
 * The type Array subset of another array.
 */
public class ArraySubsetOfAnotherArray {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        long[] a1 = {11, 7, 1, 13, 21, 3, 7, 3};
        long[] a2 = {11, 3, 7, 1, 7};
        System.out.println(isSubset(a1, a2));
        System.out.println(isSubsetWithoutDuplicate(a1, a1));
    }

    /**
     * Is subset string.
     *
     * @param a1 the a 1
     * @param a2 the a 2
     * @return the string
     */
    public static String isSubset(long[] a1, long[] a2) {
        HashMap<Long, Integer> countMap = new HashMap<>();
        for (long num : a1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (long num : a2) {
            if (!countMap.containsKey(num) || countMap.get(num) == 0) return "No";
            countMap.put(num, countMap.getOrDefault(num, 0) - 1);
        }

        return "Yes";
    }


    /**
     * Is subset without duplicate string.
     *
     * @param a1 the a 1
     * @param a2 the a 2
     * @return the string
     */
//if duplicate is not a concern
    public static String isSubsetWithoutDuplicate(long[] a1, long[] a2){
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(long num : a2){
            if(Arrays.binarySearch(a1, num) > 0){
                return "No";
            }
        }
        return "Yes";
    }
}
