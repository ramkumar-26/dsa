package org.example.binary.search;

/**
 * The type Find the ceiling number.
 */
public class FindTheCeilingNumber {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 22};
        int target = 15;
        System.out.println(findCeiling(arr, target));
    }

    private static int findCeiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        if(arr[end] < target){
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
