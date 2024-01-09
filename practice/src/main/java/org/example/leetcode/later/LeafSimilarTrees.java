package org.example.leetcode.later;

import java.util.Stack;

/**
 * The type Leaf similar trees.
 */
/*
 * Date : 9th January 2024
 * Week : 2
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/leaf-similar-trees/
 * Tag :  #notdone #Node
 * */
public class LeafSimilarTrees {
    /**
     * Leaf similar boolean.
     *
     * @param root1 the root 1
     * @param root2 the root 2
     * @return the boolean
     */
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s1 = new Stack<>(), s2 = new Stack<>();
        s1.push(root1); s2.push(root2);
        while (!s1.empty() && !s2.empty())
            if (dfs(s1) != dfs(s2)) return false;
        return s1.empty() && s2.empty();
    }

    /**
     * Dfs int.
     *
     * @param s the s
     * @return the int
     */
    public int dfs(Stack<TreeNode> s) {
        while (true) {
            TreeNode node = s.pop();
            if (node.right != null) s.push(node.right);
            if (node.left != null) s.push(node.left);
            if (node.left == null && node.right == null) return node.val;
        }
    }
}

