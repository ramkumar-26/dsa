package org.example.leetcode.later;

import java.util.Arrays;

/**
 * The type Job scheduling.
 */
/*
 * Date : 6th January 2024
 * Week : 1
 * Level: Hard
 * Link :
 * Reference : https://leetcode.com/problems/maximum-profit-in-job-scheduling/submissions/
 * Tag : #DP #notdone
 * */
public class JobScheduling {
    /**
     * The type Job.
     */
    static class Job {
        /**
         * The Start.
         */
        int start;
        /**
         * The End.
         */
        int end;
        /**
         * The Profit.
         */
        int profit;

        /**
         * Instantiates a new Job.
         *
         * @param start  the start
         * @param end    the end
         * @param profit the profit
         */
        Job(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    /**
     * Job scheduling int.
     *
     * @param startTime the start time
     * @param endTime   the end time
     * @param profit    the profit
     * @return the int
     */
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {

        int n = startTime.length;

        Job [] jobs = new Job[n];

        for(int i = 0; i < n; i++) {
            jobs[i] = new Job(startTime[i], endTime[i], profit[i]);
        }

        Arrays.sort(jobs, (a, b) -> a.end - b.end);

        int [] dp = new int[n];
        dp[0] = jobs[0].profit;

        for(int i = 1; i < n; i++) {
            Job job = jobs[i];
            int lo = 0, hi = i;

            while(lo <= hi) {
                int m = lo + (hi - lo) / 2;

                if(jobs[m].end <= job.start) {
                    lo = m + 1;
                } else {
                    hi = m - 1;
                }
            }

            if(hi < 0) {
                dp[i] = Math.max(dp[i - 1], job.profit);
            } else {
                dp[i] = Math.max(dp[i - 1], dp[hi] + job.profit);
            }
        }

        return dp[n - 1];
    }
}
