package a2z.step13.lec2;

import java.util.*;

public class BinaryTreeZigZagLevelorderTraversal {

    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isLeftToRight = true;

        while (!queue.isEmpty()) {
            int n = queue.size();
            Deque<Integer> deque = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                TreeNode node = queue.poll();
                if (isLeftToRight) {
                    deque.addLast(node.val);
                } else {
                    deque.addFirst(node.val);
                }
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(new ArrayList<>(deque));
            isLeftToRight = !isLeftToRight;
        }

        return result;
    }

    // Optional: main method for testing
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                            new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                            new TreeNode(3, new TreeNode(6), new TreeNode(7))
                        );

        List<List<Integer>> result = zigzagLevelOrder(root);
        for (List<Integer> level : result) {
            System.out.println(level);
        }
    }
}
