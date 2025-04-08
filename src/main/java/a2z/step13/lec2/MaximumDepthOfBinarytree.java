package a2z.step13.lec2;

import a2z.step13.lec2.BinaryTreeZigZagLevelorderTraversal.TreeNode;

public class MaximumDepthOfBinarytree {
    public static int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(19);
        root.left = new TreeNode(200);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(34);
        root.left.right = new TreeNode(1005);
        root.right.left = new TreeNode(68);
        root.right.right = new TreeNode(53);
        root.right.right.right = new TreeNode(0);
        root.right.right.right.left = new TreeNode(71);

        System.out.println("Maximum depth of given binary tree is : " + maxDepth(root));
    }
}
