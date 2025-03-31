/*
https://leetcode.com/problems/binary-tree-postorder-traversal/
145. Binary Tree Postorder Traversal
Given the root of a binary tree, return the postorder traversal of its nodes' values.
*/

package a2z.step13.lec1;

import java.util.ArrayList;
import java.util.List;

public class PostorderTraversalOfBT {
 
    public static List<Integer> postorderTraversal(TreeNode root) {
        return postorder(root, new ArrayList<Integer>());
    }
    public static List<Integer> postorder(TreeNode root, ArrayList<Integer> l){
        if(root==null) return l;

        postorder(root.left, l);
        postorder(root.right, l);
        l.add(root.data);
        return l;
    }

        public static void main(String[] args) {
                // {1,2,3,4,5,6,7} -- binary tree values
                TreeNode root = new TreeNode(1);
                root.left = new TreeNode(2);
                root.right = new TreeNode(3);
                root.left.left = new TreeNode(4);
                root.left.right = new TreeNode(5);
                root.right.left = new TreeNode(6);
                root.right.right = new TreeNode(7);
        
                System.out.println("Binary tree input values are: 1, 2, 3, 4, 5, 6, 7");
                List<Integer> list = postorderTraversal(root);
                for(Integer r : list){
                    System.out.print(r + "->");
                }
                System.out.println("null");
    }
}