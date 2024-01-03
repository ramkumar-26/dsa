package org.example.masai;

/**
 * The type The last digit.
 */
/*
 * Date : 3rd January 2024
 * Week : 1
 * Level: Easy
 * Link :
 * Reference : https://oj.masaischool.com/contest/4147/problem/02
 * Tag :  #easy #String
 * */
public class TheLastDigit {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int number = 5666;
        int rem = number % 10;
        if(rem%3 == 0) System.out.println("Divisible");
        else{
            System.out.println("Not Divisible");
        }
    }
}
