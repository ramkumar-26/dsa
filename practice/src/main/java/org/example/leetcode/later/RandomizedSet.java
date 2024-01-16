package org.example.leetcode.later;

import java.util.*;

/**
 * The type Randomized set.
 */
/*
 * Date : 16th January 2024
 * Week : 3
 * Level: Medium
 * Link :
 * Reference :https://leetcode.com/problems/insert-delete-getrandom-o1/
 * Tag :  #notdone
 * */
public class RandomizedSet {
    /**
     * The Nums.
     */
    List<Integer> nums;
    /**
     * The Idx map.
     */
    Map<Integer, Integer> idxMap;
    /**
     * The Random.
     */
    Random random;

    /**
     * Instantiates a new Randomized set.
     */
    public RandomizedSet() {
        nums = new ArrayList<>();
        idxMap = new HashMap<>();
        random = new Random();
    }

    /**
     * Insert boolean.
     *
     * @param val the val
     * @return the boolean
     */
    public boolean insert(int val) {
        if (idxMap.containsKey(val)) {
            return false;
        }

        idxMap.put(val, nums.size());
        nums.add(val);
        return true;
    }

    /**
     * Remove boolean.
     *
     * @param val the val
     * @return the boolean
     */
    public boolean remove(int val) {
        if (!idxMap.containsKey(val)) {
            return false;
        }

        int idx = idxMap.get(val);
        int lastIdx = nums.size() - 1;
        if (idx != lastIdx) {
            int lastVal = nums.get(lastIdx);
            nums.set(idx, lastVal);
            idxMap.put(lastVal, idx);
        }
        nums.remove(lastIdx);
        idxMap.remove(val);
        return true;
    }

    /**
     * Gets random.
     *
     * @return the random
     */
    public int getRandom() {
        return nums.get(random.nextInt(nums.size()));
    }
}
