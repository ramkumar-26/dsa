package org.example.linear.search;

/**
 * The type Search in 2 d array.
 */
public class SearchIn2DArray {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
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
