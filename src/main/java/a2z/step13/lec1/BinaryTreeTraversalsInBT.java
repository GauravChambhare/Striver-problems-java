package a2z.step13.lec1;

import java.util.*;

class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode() {
        this.data = 0;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTreeTraversalsInBT {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(inOrder(root, new ArrayList<>()));
        res.add(preOrder(root, new ArrayList<>()));
        res.add(postOrder(root, new ArrayList<>()));
        return res;
    }

    private static ArrayList<Integer> inOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return list;
        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);
        return list;
    }

    private static ArrayList<Integer> preOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return list;
        list.add(root.data);
        preOrder(root.left, list);
        preOrder(root.right, list);
        return list;
    }

    private static ArrayList<Integer> postOrder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return list;
        postOrder(root.left, list);
        postOrder(root.right, list);
        list.add(root.data);
        return list;
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

        // Getting tree traversals
        List<List<Integer>> traversals = getTreeTraversal(root);

        // Printing results
        System.out.println("Inorder Traversal: " + traversals.get(0));
        System.out.println("Preorder Traversal: " + traversals.get(1));
        System.out.println("Postorder Traversal: " + traversals.get(2));
    }
}

