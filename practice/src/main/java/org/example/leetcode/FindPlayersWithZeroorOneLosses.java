package org.example.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Find players with zeroor one losses.
 */
/*
 * Date : 15th January 2024
 * Week : 3
 * Level: Medium
 * Link :
 * Reference : https://leetcode.com/problems/find-players-with-zero-or-one-losses/
 * Tag : #Array #notdone
 * */
public class FindPlayersWithZeroorOneLosses {
    /**
     * Find winners list.
     *
     * @param matches the matches
     * @return the list
     */
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];

        for (int i = 0; i < matches.length; i++) {
            int win = matches[i][0];
            int loss = matches[i][1];

            if (losses[win] == 0) {
                losses[win] = -1;
            }

            if (losses[loss] == -1) {
                losses[loss] = 1;
            } else {
                losses[loss]++;
            }
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < losses.length; i++) {
            if (losses[i] == -1) {
                zeroLoss.add(i);
            } else if (losses[i] == 1) {
                oneLoss.add(i);
            }
        }

        result.add(zeroLoss);
        result.add(oneLoss);

        return result;
    }
}
