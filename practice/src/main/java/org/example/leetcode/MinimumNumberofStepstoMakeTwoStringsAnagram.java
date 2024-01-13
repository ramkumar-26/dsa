package org.example.leetcode;

/**
 * The type Minimum numberof stepsto make two strings anagram.
 */
/*
 * Date : 13th January 2024
 * Week : 2
 * Level: Medium
 * Link :
 * Reference : https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
 * Tag : #Array #notdone
 * */
public class MinimumNumberofStepstoMakeTwoStringsAnagram {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

    }

    /**
     * Min steps int.
     *
     * @param s the s
     * @param t the t
     * @return the int
     */
    public int minSteps(String s, String t) {

        int[] count = new int[26];
        for (int i = 0; i < s.length(); ++i) {
            ++count[s.charAt(i) - 'a'];
            --count[t.charAt(i) - 'a'];
        }

        int steps = 0;
        for (int step : count) {
            if (step > 0) {
                steps += step;
            }
        }
        return steps;
    }
}
