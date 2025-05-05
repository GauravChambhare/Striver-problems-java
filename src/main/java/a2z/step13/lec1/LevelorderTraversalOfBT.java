/*
 https://leetcode.com/problems/binary-tree-level-order-traversal/
 102. Binary Tree Level Order Traversal
*/

package a2z.step13.lec1;

import java.util.*;

class TreeNode4 {
    int data;
    TreeNode4 left, right;

    TreeNode4() {}

    TreeNode4(int data) {
        this.data = data;
    }

    TreeNode4(int data, TreeNode4 left, TreeNode4 right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class LevelorderTraversalOfBT {
    public static List<List<Integer>> levelOrder(TreeNode4 root) {
        Queue<TreeNode4> queue = new LinkedList<>();
        List<List<Integer>> result = new LinkedList<>();
        
        if (root == null) return result;
        
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> sublist = new LinkedList<>(); 
            
            for (int i = 0; i < size; i++) {
                TreeNode4 current = queue.poll();
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
        TreeNode4 root = new TreeNode4(1);
        root.left = new TreeNode4(2);
        root.right = new TreeNode4(3);
        root.left.left = new TreeNode4(4);
        root.left.right = new TreeNode4(5);
        root.right.left = new TreeNode4(6);
        root.right.right = new TreeNode4(7);

        // Running level order traversal
        List<List<Integer>> traversalResult = levelOrder(root);

        // Printing the result
        System.out.println("Level Order Traversal: " + traversalResult);
    }
}
