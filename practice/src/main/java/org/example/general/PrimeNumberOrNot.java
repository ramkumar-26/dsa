package org.example.general;

import java.util.Scanner;

/**
 * The type Prime number or not.
 */
/*
 * Date : 6 November 2023
 * Level: Easy
 * Link :
 * Reference :
 * Tag : #primeNumber  #whileLoop
 * */
public class PrimeNumberOrNot {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return (c * c) > n;
    }
}
