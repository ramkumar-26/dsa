package org.example.leetcode.later;

/**
 * The type Maximum difference between nodeand ancestor.
 */
/*
 * Date : 11th January 2024
 * Week : 2
 * Level: Medium
 * Link :
 * Reference : https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
 * Tag :  #notdone #Node
 * */
public class MaximumDifferenceBetweenNodeandAncestor {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

    }

    /**
     * Max ancestor diff int.
     *
     * @param root the root
     * @return the int
     */
    public int maxAncestorDiff(TreeNode root) {
        return dfs(root, root.val, root.val);
    }

    /**
     * Dfs int.
     *
     * @param root the root
     * @param mn   the mn
     * @param mx   the mx
     * @return the int
     */
    public int dfs(TreeNode root, int mn, int mx) {
        if (root == null) return mx - mn;
        mx = Math.max(mx, root.val);
        mn = Math.min(mn, root.val);
        return Math.max(dfs(root.left, mn, mx), dfs(root.right, mn, mx));
    }
}
