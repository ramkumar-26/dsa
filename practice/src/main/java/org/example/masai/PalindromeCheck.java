package org.example.masai;

import java.util.Scanner;

/*
 * Date : 29th December 2023
 * Level: Easy
 * Link :
 * Reference : https://oj.masaischool.com/contest/4132/problem/1
 * Tag :  #easy #String #StringBuilder
 * */
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        String numStr = Integer.toString(num);

        if (numStr.contentEquals(new StringBuilder(numStr).reverse())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
