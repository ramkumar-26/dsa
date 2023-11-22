package org.example.linear.search;

/**
 * The type Even no of digits.
 */
/*
 * Date : 21 November 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Tag :
 * */
public class EvenNoOfDigits {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {123, 12, 44, 567, 98};
        int count = 0;
        for(int n: nums){
            if(isEvenDigit(n)) count++;
        }
        System.out.println(count);
    }

    /**
     * Is even digit boolean.
     *
     * @param n the n
     * @return the boolean
     */
    static boolean isEvenDigit(int n){
        int digit = 0;
        while(n>0){
            digit++;
            n = n/10;
        }
        return digit % 2 == 0;
    }
}