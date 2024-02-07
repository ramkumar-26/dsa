package org.example.binary.search;

import java.util.HashSet;


/*
 * Date : 5 Feb 2024
 * Level: Easy
 * Link :
 * Reference : https://www.geeksforgeeks.org/problems/find-pair-given-difference1559/1?page=1&category=Binary%20Search&difficulty=Easy&sortBy=submissions
 * Tag : #BinarySearch #TwoPointer #HashSet
 * */

/**
 * The type Find pair given difference.
 */
public class FindPairGivenDifference {
    /*
     * Given an array Arr[] of size L and a number N,
     * you need to write a program to find if there exists
     * a pair of elements in the array whose difference is N.
     * */

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int arr[] = {5, 20, 3, 2, 5, 80};
        int n = 78;
        System.out.println(bruteforce(arr, n));
        System.out.println(usinBinarySearch(arr, n));
        System.out.println(usingHashSet(arr, n));
        System.out.println(usingSortingAndWhileLoop(arr, n));
    }

    /**
     * Bruteforce boolean.
     *
     * @param arr the arr
     * @param n   the n
     * @return the boolean
     */
    static boolean bruteforce(int[] arr, int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[j] - arr[i]) == n) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Usin binary search boolean.
     *
     * @param arr the arr
     * @param n   the n
     * @return the boolean
     */
    static boolean usinBinarySearch(int[] arr, int n) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (binarySearch(arr, i + 1, arr.length - 1, arr[i] + n)) return true;
        }
        return false;
    }

    /**
     * Binary search boolean.
     *
     * @param arr    the arr
     * @param start  the start
     * @param end    the end
     * @param target the target
     * @return the boolean
     */
    static boolean binarySearch(int[] arr, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return true;
            if (arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }

    /**
     * Using hash set boolean.
     *
     * @param arr the arr
     * @param n   the n
     * @return the boolean
     */
    static boolean usingHashSet(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(num - n) || set.contains(num + n)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    /**
     * Using sorting and while loop boolean.
     *
     * @param arr the arr
     * @param n   the n
     * @return the boolean
     */
    static boolean usingSortingAndWhileLoop(int[] arr, int n) {
        int i = 0, j = 1;
        while (i < arr.length && j < arr.length) {
            if (i != j && arr[j] - arr[i] == n) {
                return true;
            }
            if (arr[j] - arr[i] > n) {
                i++;
            } else {
                j++;
            }
        }
        return false;
    }

}
