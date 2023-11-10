package org.example.array;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Map<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int numberOfPair = map.getOrDefault(nums[i], 0);
            ans += numberOfPair;
            map.put(nums[i], numberOfPair + 1);
        }
        System.out.println(ans);
    }
}
