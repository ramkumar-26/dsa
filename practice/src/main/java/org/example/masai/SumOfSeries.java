package org.example.masai;

/**
 * The type Sum of series.
 */
/*
 * Date : 8th January 2024
 * Week : 2
 * Level: Easy
 * Link :
 * Reference : https://oj.masaischool.com/contest/4148/problem/02
 * Tag :  #easy #Math.pow
 * */
public class SumOfSeries {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        findSumOfSeries(3, 2);
    }

    /**
     * Find sum of series long.
     *
     * @param N the n
     * @param X the x
     * @return the long
     */
    public static void findSumOfSeries(int N, int X){
        long sum = 0;
        if (N <= 0 || X <= 0) {
            System.out.println(-1);
        } else {
            for (int i = 1; i < N; i++) {
                sum += (long) Math.pow(X, i);
            }
            System.out.println(sum + 1);
        }
    }
}
