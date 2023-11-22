package org.example.linear.search;

/**
 * The type Richest customer wealth.
 */
/*
 * Date : 22 November 2023
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/richest-customer-wealth/
 * Tag :
 * */
public class RichestCustomerWealth {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 55 ,3},
                {44, 39},
                {8, 4, 6, 7, 8}
        };
        System.out.println(maximumWealth(accounts));
    }

    /**
     * Maximum wealth int.
     *
     * @param accounts the accounts
     * @return the int
     */
    public static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int[] innerArr : accounts){
            int sum = 0;
            for(int num : innerArr){
                sum += num;
            }
            if(sum > max) max = sum;
        }
        return max;
    }
}
