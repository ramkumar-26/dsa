package org.example.binary.search;

public class BalanceWithRespectToAnArray {
    public static void main(String[] args) {

    }
    public static String isBalanced(int arr[],int n,int x)
    {
        int left = bs(arr, x, true);
        int right = bs(arr, x, false);

        // Check if floor and ceil both exist and if their differences are equal
        if ((left != -1 && right != -1) && Math.abs(x - left) == Math.abs(right - x)) {
            return "Yes";
        }

        return "No";
    }

    private static int bs(int[] arr, int x, boolean isLeft) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                return x; // Element found, floor of x is x itself
            } else if (arr[mid] < x) {
                if(!isLeft){
                    ans = arr[mid];
                } // Update floor and search in the right half
                left = mid + 1;
            } else {
                right = mid - 1;
                if(isLeft){
                    ans = arr[mid];
                }// Search in the left half
            }
        }

        return ans;
    }
}
