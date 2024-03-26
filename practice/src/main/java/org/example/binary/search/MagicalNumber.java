package org.example.binary.search;

/*
 * Date : 15 February 2024
 * Level: Easy (Tricky)
 * Link :
 * Reference : https://www.geeksforgeeks.org/problems/magical-number-1587115620/1?page=1&category=Binary%20Search&sortBy=difficulty
 * Tag : #BinarySearch
 * */
/**
 * The type Magical number.
 */
public class MagicalNumber {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {-10, -5, 1, 2, 3, 5, 9, 12, 15};
        System.out.println(magicalBinarySearch(arr));
    }

    /**
     * Magical binary search int.
     *
     * @param arr the arr
     * @return the int
     */
    static int magicalBinarySearch(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == mid) {
                while(mid > 0 && arr[mid-1] == mid-1){
                    mid--;
                }
                return mid;
            }else if(mid > arr[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
