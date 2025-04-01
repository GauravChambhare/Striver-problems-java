/*
 https://leetcode.com/problems/binary-tree-level-order-traversal/
 102. Binary Tree Level Order Traversal
*/

package a2z.step13.lec1;

import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode() {}

    TreeNode(int data) {
        this.data = data;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class LevelorderTraversalOfBT {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        
        if (root == null) return result;
        
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> sublist = new LinkedList<>();
            
            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();
                sublist.add(current.data);
                
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
            
            result.add(sublist);
        }
        return result;
    }

    public static void main(String[] args) {
        // Creating a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Running level order traversal
        List<List<Integer>> traversalResult = levelOrder(root);

        // Printing the result
        System.out.println("Level Order Traversal: " + traversalResult);
    }
}
