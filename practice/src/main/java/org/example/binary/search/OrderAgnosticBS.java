package org.example.binary.search;

/**
 * The type Order agnostic bs.
 */
public class OrderAgnosticBS {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] revArr = {9,8,7,6,5,4,3,2,1};
        System.out.println(orderAgnosticBS(revArr, 6));
    }

    /**
     * Order agnostic bs int.
     *
     * @param arr    the arr
     * @param target the target
     * @return the int
     */
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
