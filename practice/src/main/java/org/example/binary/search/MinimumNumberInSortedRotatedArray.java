package org.example.binary.search;

/*
 * Date : 7 Feb 2024
 * Level: Easy
 * Link :
 * Reference : https://www.geeksforgeeks.org/problems/minimum-number-in-a-sorted-rotated-array-1587115620/1?page=1&category=Binary%20Search&difficulty=Easy&sortBy=submissions
 * Tag : #BinarySearch
 * */
/**
 * The type Minimum number in sorted rotated array.
 */
public class MinimumNumberInSortedRotatedArray {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,1};
        System.out.println(minNumber(arr));
    }

    /**
     * Min number int.
     *
     * @param arr the arr
     * @return the int
     */
    //with mid
    static int minNumber(int[] arr) {
        int start = 0, end = arr.length - 1;
        if (arr[start] <= arr[end]) {
            return arr[start];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return arr[mid + 1];
            }
            if (arr[mid - 1] > arr[mid]) {
                return arr[mid];
            }
            if (arr[mid] > arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Minimum number int.
     *
     * @param arr the arr
     * @return the int
     */
    //with end
    static int minimumNumber(int[] arr){
        int start =0, end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[end]){
                start = mid + 1;
            }else if(arr[mid] < arr[end]){
                end = mid;
            }else{
                end--;
            }
        }
        return arr[start];
    }
}
