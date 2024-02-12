package org.example.binary.search;


/*
 * Date : 12th February 2024
 * Level: Easy
 * Link :
 * Reference : https://www.geeksforgeeks.org/problems/find-the-closest-number5513/1?page=1&category=Binary%20Search&difficulty=Easy&sortBy=submissions
 * Tag : #BinarySearch
 * */

/**
 * The type Find the closest number.
 */
public class FindTheClosestNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9};
        System.out.println(findClosest(arr, 7));
    }

    /**
     * Find closest int.
     *
     * @param arr    the arr
     * @param target the target
     * @return the int
     */
    public static int findClosest(int[] arr, int target) {
        // Complete the function
        int start = 0;
        int end = arr.length - 1;
        int closest = arr[start]; // Initialize with the first element

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return target;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            // Update closest if necessary
            if (Math.abs(arr[mid] - target) < Math.abs(closest - target)) {
                closest = arr[mid];
            } else if (Math.abs(arr[mid] - target) == Math.abs(closest - target) && arr[mid] > closest) {
                closest = arr[mid];
            }
        }

        return closest;

    }
}
