package org.example.restart;

/**
 * The type Binary search.
 */
public class BinarySearch {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 7;
        System.out.println(binarySearch(arr, target));
        System.out.println(Math.abs(1-3));
    }

    /**
     * Binary search int.
     *
     * @param arr    the arr
     * @param target the target
     * @return the int
     */
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;


    }
}
