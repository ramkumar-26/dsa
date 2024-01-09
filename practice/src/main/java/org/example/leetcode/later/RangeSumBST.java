package org.example.leetcode.later;

/**
 * The type Range sum bst.
 */
/*
 * Date : 8th January 2024
 * Week : 2
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/range-sum-of-bst/
 * Tag :  #notdone #Node
 * */
public class RangeSumBST {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

    }

    /**
     * Range sum bst int.
     *
     * @param root the root
     * @param low  the low
     * @param high the high
     * @return the int
     */
    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;
        int sum = 0;
        if (root.val >= low && root.val <= high) sum += root.val;
        if (root.val > low) sum += rangeSumBST(root.left, low, high);
        if (root.val < high) sum += rangeSumBST(root.right, low, high);

        return sum;
    }
}

/**
 * The type Tree node.
 */
class TreeNode {
    /**
     * The Val.
     */
    int val;
    /**
     * The Left.
     */
    TreeNode left;
    /**
     * The Right.
     */
    TreeNode right;

    /**
     * Instantiates a new Tree node.
     */
    TreeNode() {
    }

    /**
     * Instantiates a new Tree node.
     *
     * @param val the val
     */
    TreeNode(int val) {
        this.val = val;
    }

    /**
     * Instantiates a new Tree node.
     *
     * @param val   the val
     * @param left  the left
     * @param right the right
     */
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
