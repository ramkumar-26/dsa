package org.example.general;

/*
 * Date : 5 November 2023
 * Level: Easy
 * Link :
 * Reference :
 * Tag :  #whileLoop
 * */
public class NoOfOccurancesOfADigit {
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

