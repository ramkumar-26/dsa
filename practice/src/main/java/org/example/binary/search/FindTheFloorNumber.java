package org.example.binary.search;

public class FindTheFloorNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18, 22};
        int target = 7;
        System.out.println(findFloor(arr, target));
    }

    private static int findFloor(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        if(arr[start] > target){
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
        return end;
    }
}
