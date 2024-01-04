package org.example.masai;

/**
 * The type Check vowel.
 */
/*
 * Date : 4th January 2024
 * Week : 1
 * Level: Easy
 * Link :
 * Reference : https://oj.masaischool.com/contest/4147/problem/09
 * Tag :  #easy #String
 * */
public class CheckVowel {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int N = 6;
        String str = "nrupul";

        // Convert the string to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Check if the string contains at least one vowel
        boolean containsVowel = false;

        for (int i = 0; i < N; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                containsVowel = true;
                break; // Break the loop if a vowel is found
            }
        }

        // Print the result
        System.out.println(containsVowel);
    }
}
