/*
 https://leetcode.com/problems/binary-tree-inorder-traversal/description/
 94. Binary Tree Inorder Traversal
 Given the root of a binary tree, return the inorder traversal of its nodes' values.
 - time complexity for this will be O(N) and 
*/

package a2z.step13.lec1;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversalOfBT {

    public static List<Integer> InorderTraversal(TreeNode root) {
        return inorder(root, new ArrayList<Integer>());
    }
    public static List<Integer> inorder(TreeNode root, ArrayList<Integer> l){
        if(root==null) return l;

        inorder(root.left, l);
        l.add(root.data);
        inorder(root.right, l);
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
                List<Integer> list = InorderTraversal(root);
                for(Integer r : list){
                    System.out.print(r + "->");
                }
                System.out.println("null");
    }
}
