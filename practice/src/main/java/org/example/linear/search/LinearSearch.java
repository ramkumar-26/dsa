package org.example.linear.search;

public class LinearSearch {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {10, 11, 112, 24, 33};
        System.out.println(findTheNumber(n, arr));
    }

    private static int findTheNumber(int n, int[] arr) {
        for (int num : arr) {
            if (num == n) {
                return num;
            }
        }
        return -1;
    }
}
