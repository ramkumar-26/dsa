package org.example.leetcode.later;

import java.util.*;

/**
 * The type Amountof timefor binary treeto be infected.
 */
/*
 * Date : 10th January 2024
 * Week : 2
 * Level: Easy
 * Link :
 * Reference : https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/
 * Tag :  #notdone #Node
 * */
public class AmountofTimeforBinaryTreetoBeInfected {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

    }

    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    /**
     * Amount of time int.
     *
     * @param root  the root
     * @param start the start
     * @return the int
     */
    public int amountOfTime(TreeNode root, int start) {
        convertToGraph(root);
        Deque<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        int time = -1;

        while (!queue.isEmpty()) {
            time++;
            for (int i = queue.size(); i > 0; i--) {
                int currentNode = queue.pollFirst();
                visited.add(currentNode);

                if (adjacencyList.containsKey(currentNode)) {
                    for (int neighbor : adjacencyList.get(currentNode)) {
                        if (!visited.contains(neighbor)) {
                            queue.offer(neighbor);
                        }
                    }
                }
            }
        }
        return time;
    }

    private void convertToGraph(TreeNode node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            adjacencyList.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.left.val);
            adjacencyList.computeIfAbsent(node.left.val, k -> new ArrayList<>()).add(node.val);
        }

        if (node.right != null) {
            adjacencyList.computeIfAbsent(node.val, k -> new ArrayList<>()).add(node.right.val);
            adjacencyList.computeIfAbsent(node.right.val, k -> new ArrayList<>()).add(node.val);
        }


        convertToGraph(node.left);
        convertToGraph(node.right);
    }
}
