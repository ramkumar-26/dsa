package org.example.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The type Unique numberof occurrences.
 */
/*
 * Date : 17th January 2024
 * Week : 2
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/unique-number-of-occurrences/
 * Tag : #Array #notdone
 * */
public class UniqueNumberofOccurrences {
    /**
     * Unique occurrences boolean.
     *
     * @param arr the arr
     * @return the boolean
     */
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}
