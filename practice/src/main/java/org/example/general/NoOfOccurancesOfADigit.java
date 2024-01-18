package org.example.general;

/**
 * The type No of occurances of a digit.
 */
/*
 * Date : 5 November 2023
 * Level: Easy
 * Link :
 * Reference :
 * Tag :  #whileLoop
 * */
public class NoOfOccurancesOfADigit {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int n = 455355;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}

