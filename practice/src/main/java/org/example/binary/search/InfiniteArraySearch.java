package org.example.binary.search;

/*
 * Date : 29 November 2023
 * Level: Easy (Amazon : Medium)
 * Link :
 * Reference :
 * Tag : #BinarySearch #slidingWindow
 * */

/**
 * The type Infinite array search.
 */
public class InfiniteArraySearch {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8, 12, 15, 17, 22};
        int target = 15;
        System.out.println(findWindow(arr, target));
    }

    /**
     * Find window int.
     *
     * @param arr    the arr
     * @param target the target
     * @return the int
     */
    static int findWindow(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + ((end - start + 1) * 2);
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    /**
     * Binary search int.
     *
     * @param arr    the arr
     * @param target the target
     * @param start  the start
     * @param end    the end
     * @return the int
     */
    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
