package org.example.leetcode;

/**
 * The type Number of laser beam ina bank.
 */
/*
 * Date : 3rd January 2024
 * Week : 1
 * Level: Medium
 * Link :
 * Reference : https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
 * Tag : #Array #notdone
 * */
public class NumberOfLaserBeamInaBank {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String[] s = {"011001", "000000", "010100", "001000"};
        System.out.println(numberOfBeams(s));
    }

    /**
     * Number of beams int.
     *
     * @param bank the bank
     * @return the int
     */
    public static int numberOfBeams(String[] bank) {
        int ans = 0, prev = 0, count = 0;
        for (String s : bank) {
            count = 0;
            for (int i = 0; i < s.length(); i++)
                if (s.charAt(i) == '1') count++;
            if (count > 0) {
                ans += prev * count;
                prev = count;
            }
        }
        return ans;
    }
}
