package org.example.binary.search;

import java.util.Arrays;

/**
 * The type Longest subsequence with limited sum.
 */
public class LongestSubsequenceWithLimitedSum {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        int[] nums = {4,5,2,1};
        int[] queries = {3, 10, 21};
        System.out.println(answerQueries(nums, queries));
    }

    /**
     * Answer queries int [ ].
     *
     * @param nums    the nums
     * @param queries the queries
     * @return the int [ ]
     */
    public static int[] answerQueries(int[] nums, int[] queries) {
        int n = nums.length;

        //sorting the array will provide us with the smallest elements first so that the length of the subarray can be maximized for a particular value of sum
        Arrays.sort(nums);
        int ans [] = new int [queries.length];
        int prefix[] = new int [n+1];

        //filling the prefix array
        for(int i = 1; i<n+1; i++){ //prefix[0] = 0; for sum = 0
            prefix[i] = prefix[i-1]+nums[i-1];
        }
        /*Prefix array works like this for sorted array 1,2,4,5
           index: 0    1   2   3   4     index is equal to the length of subarray
           value: 0    1   3   7   12    value is equal to the sum of subarray of length index
        */
        //searching and returning the length of subarray required for the sum
        for(int i = 0; i<queries.length; i++){
            int val = queries[i];
            ans[i] = binarySearch(val, prefix);
        }

        return ans;
    }

    /**
     * Binary search int.
     *
     * @param val    the val
     * @param prefix the prefix
     * @return the int
     */
    public static int binarySearch(int val, int [] prefix){
        int low = 0;
        int high = prefix.length-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(prefix[mid] == val) return mid;
            else if(prefix[mid] < val) low = mid+1;
            else high = mid-1;
        }
        //if the exact value is not found in prefix array then we will need to return the closest
        if(val > prefix[high]) return high; //if the sum in queries is larger then the closest value would be at index high else it would be at index low
        return low;
    }

}
