package org.example.linear.search;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 33, 523, 2},
                {1, 2, 3, 4},
                {12, 22}
        };
        int target = 523;
        System.out.println(searchTarget(arr, target));
    }

    private static boolean searchTarget(int[][] arr, int target) {
        for (int[] innerArr : arr) {
            for (int num : innerArr) {
                if (num == target) return true;
            }
        }
        return false;
    }
}
