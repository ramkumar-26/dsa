package org.example.linear.search;

public class FindMinimumNumber {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(getMinimum(arr));
    }

    private static int getMinimum(int[] arr) {
        int min = arr[0];
        for(int n: arr){
            if(min > n){
                min = n;
            }
        }
        return min;
    }
}
