package org.example.general;

import java.util.Scanner;
/*
 * Date : 7 November 2023
 * Level: Easy
 * Link :
 * Reference :
 * Tag :  #armstrongNumber #forloop
 * */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int original = n;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n/10;
        }
        if (original == sum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
