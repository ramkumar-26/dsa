package org.example.leetcode;

import java.util.Arrays;

/*
 * Date : 1st January 2024
 * Week : 1
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/assign-cookies/
 * Tag : #Array #TwoPointer #Greedy #Sorting
 * */
/**
 * The type Find content children.
 */
public class FindContentChildren {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] children = {1, 2, 3};
        int[] cookies = {1, 1};
        System.out.println(findContentChildren(children, cookies));
    }

    /**
     * Find content children int.
     *
     * @param g the g
     * @param s the s
     * @return the int
     */
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gpointer = 0, cpointer = 0, count = 0;
        while (gpointer < g.length && cpointer < s.length) {
            if (g[gpointer] <= s[cpointer]) {
                count++;
                gpointer++;
                cpointer++;
            } else
                cpointer++;
        }
        return count;
    }
}
