package org.example.general;

import java.util.Scanner;

/*
 * Date : 4 November 2023
 * Level: Easy
 * Link :
 * Reference :
 * Tag : #recursion #fibonacci #forloop
 * */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0 || n == 1) {
            System.out.println(n);
            return;
        }
        int prev2 = 0, prev1 = 1, cur = 0;
        for (int i = 2; i <= n; i++) {
            cur = prev1 + prev2;
            prev1 = prev2;
            prev2 = cur;
        }
        System.out.println("For Loop  : " + cur);
        System.out.println("Recursive : " + recursive(n));
    }

    static int recursive(int n) {
        if (n == 0 || n == 1) return n;
        return recursive(n - 2) + recursive(n - 1);
    }

}

