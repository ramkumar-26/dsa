package org.example.masai;

import java.util.HashMap;
import java.util.Map;

/**
 * The type Map characters and sum.
 */
/*
 * Date : 28th December 2023
 * Level: Easy
 * Link :
 * Reference : https://oj.masaischool.com/contest/4108/problem/03
 * Tag : #Map #easy #Char
 * */
public class MapCharactersAndSum {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int N = 30;
        String str = "abc";

        // Create a Map to store character mappings
        Map<Character, Integer> charIntegerMap = new HashMap<>();

        // Map characters starting from N
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            charIntegerMap.put(ch, N + i);
        }

        int sum = 0;

        // Calculate the sum of mapped values in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            Integer mappedValue = charIntegerMap.get(ch);

            if (mappedValue != null) {
                sum += mappedValue;
            }
        }

        // Print the sum
        System.out.println(sum);
    }
}
