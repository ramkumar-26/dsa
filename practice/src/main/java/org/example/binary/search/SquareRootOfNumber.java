package org.example.binary.search;


/*
 * Date : 6 Feb 2024
 * Level: Easy
 * Link :
 * Reference : https://www.geeksforgeeks.org/problems/square-root/1?page=1&category=Binary%20Search&difficulty=Easy&sortBy=submissions
 * Tag : #BinarySearch
 * */
/**
 * The type Square root of number.
 */
public class SquareRootOfNumber {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(usingBinarySearch(2));
    }

    /**
     * Using binary search long.
     *
     * @param x the x
     * @return the long
     */
//Li8: Binary Search: O(log N)
    static long usingBinarySearch(long x) {
        if (x == 0 || x == 1) return x;
        long start = 0, end = x, ans = 0;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid == x) return mid;
            if (mid * mid < x) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    /**
     * Brute force long.
     *
     * @param x the x
     * @return the long
     */
//Li8: Brute Force: O(sqrt(N))
     static long bruteForce(long x){
        if (x == 0 || x == 1) return x;
        long result = 1;
        while(result * result <= x){
            result++;
        }
        return result-1;
    }
}
