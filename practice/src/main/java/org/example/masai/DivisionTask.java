package org.example.masai;


import java.util.Scanner;

/*
 * Date : 27th December 2023
 * Level: Easy
 * Link :
 * Reference : https://oj.masaischool.com/contest/4079/problem/3
 * Tag : #Division #Math.floor31 #Tricky
 * */

/**
 * The type Division task.
 */
/*
* Question :
    You are given a number N. Let’s say you derive a variable x which is equal to the floor of a number you get when 32 is divided by N.

    In case x is 0, print "Too Low."
    In case it is not possible to generate a valid number, print -1.
    In all other cases, print x.
*
* */
public class DivisionTask
{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        divisionTask(num);
    }

    private static void divisionTask(int num) {
        // Handle division by zero
        if (num == 0) {
            System.out.println(-1);
            return;
        }

        int x = 32 / num;
        if (x == 0) {
            System.out.println("Too Low");
        } else {
            System.out.println(x);
        }
    }
}
