package org.example.leetcode;

import java.util.Arrays;

/**
 * The type Determineif two strings are close.
 */
/*
 * Date : 14rd January 2024
 * Week : 2
 * Level: Medium
 * Link :
 * Reference : https://leetcode.com/problems/determine-if-two-strings-are-close/
 * Tag : #Array #notdone
 * */
public class DetermineifTwoStringsAreClose {
    private int N = 26;

    /**
     * Close strings boolean.
     *
     * @param word1 the word 1
     * @param word2 the word 2
     * @return the boolean
     */
    public boolean closeStrings(String word1, String word2) {
        // count the English letters
        int[] arr1 = new int[N], arr2 = new int[N];
        for (char ch : word1.toCharArray())
            arr1[ch - 'a']++;
        for (char ch : word2.toCharArray())
            arr2[ch - 'a']++;

        // if one has a letter which another one doesn't have, dont exist
        for (int i = 0; i < N; i++) {
            if (arr1[i] == arr2[i]) {
                continue;
            }
            if (arr1[i] == 0 || arr2[i] == 0) {
                return false;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < N; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
