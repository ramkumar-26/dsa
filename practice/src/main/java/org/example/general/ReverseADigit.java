package org.example.general;

/**
 * The type Reverse a digit.
 */
/*
 * Date : 5 November 2023
 * Level: Easy
 * Link :
 * Reference :
 * Tag : #reverseADigit #whileLoop
 * */
public class ReverseADigit {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int n = 123456;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            ans = (ans * 10) + rem;
            n = n / 10;
        }
        System.out.println(ans);
    }
}
