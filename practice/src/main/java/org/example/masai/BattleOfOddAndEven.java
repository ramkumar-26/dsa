package org.example.masai;

/*
 * Date : 26th December 2023
 * Level: Easy
 * Link :
 * Reference :  https://oj.masaischool.com/contest/4111/problem/3
 * Tag : #Odd #Even #easy
 * */

/**
 * The type Battle of odd and even.
 */
public class BattleOfOddAndEven {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int odd = 0, even = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                even += arr[i];
            }else {
                odd += arr[i];
            }
        }
        if (odd > even){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
}
