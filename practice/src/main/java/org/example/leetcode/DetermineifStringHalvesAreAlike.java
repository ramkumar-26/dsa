package org.example.leetcode;

/**
 * The type Determineif string halves are alike.
 */
/*
 * Date : 12nd January 2024
 * Week : 2
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/determine-if-string-halves-are-alike/
 * Tag :
 * */
public class DetermineifStringHalvesAreAlike {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

    }

    /**
     * The Vowels.
     */
    String vowels = "aeiouAEIOU";

    /**
     * Halves are alike boolean.
     *
     * @param S the s
     * @return the boolean
     */
    public boolean halvesAreAlike(String S) {
        int mid = S.length() / 2, ans = 0;
        for (int i = 0, j = mid; i < mid; i++, j++) {
            if (vowels.indexOf(S.charAt(i)) >= 0) ans++;
            if (vowels.indexOf(S.charAt(j)) >= 0) ans--;
        }
        return ans == 0;
    }
}