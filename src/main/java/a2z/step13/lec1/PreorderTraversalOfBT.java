/*
https://leetcode.com/problems/binary-tree-preorder-traversal/description/
144. Binary Tree Preorder Traversal
Given the root of a binary tree, return the preorder traversal of its nodes' values.
*/

package a2z.step13.lec1;
import java.util.*;

public class PreorderTraversalOfBT {

    public static List<Integer> preOrderTraversal(TreeNode root){
        return preOrder(root, new ArrayList<Integer>() );
    }
    public static List<Integer> preOrder(TreeNode root, ArrayList<Integer> l){
        if (root == null) {
            return l;
        }
        l.add(root.data); // Visit the root
        preOrder(root.left, l); // Traverse the left subtree
        preOrder(root.right, l); // Traverse the right subtree
        return l;
    }
/* 
// using preorder traversal using iteration
public static void preOrder(TreeNode<Integer> root) {
    if (root == null) return;

    Stack<TreeNode<Integer>> stack = new Stack<>();
    List<Integer> list = new ArrayList<>();

    stack.push(root);

    while (!stack.isEmpty()) {
        TreeNode<Integer> top = stack.pop();
        list.add(top.data);

        // Push right first, so that left is processed first
        if (top.right != null) stack.push(top.right);
        if (top.left != null) stack.push(top.left);
    }

    for (Integer s : list) {
        System.out.print(s + " ");
    }
}
*/
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
        List<Integer> list = preOrderTraversal(root);
        for(Integer r : list){
            System.out.print(r + "->");
        }
        System.out.println("null");
    }
    
}
