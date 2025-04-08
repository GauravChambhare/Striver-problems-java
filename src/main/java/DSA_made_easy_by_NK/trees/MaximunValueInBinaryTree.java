/*
 * We have to find maximum value from the odes in binary tree
 */

package DSA_made_easy_by_NK.trees;

public class MaximunValueInBinaryTree {
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
/* // simpler method
    public static int maxValueInBT(TreeNode root){
        int  maxValue = Integer.MIN_VALUE;
        if(root!=null){
            int maxleft = maxValueInBT(root.left);
            int maxright = maxValueInBT(root.right);

            if(maxleft > maxright){
                maxValue = maxleft;
            }
            else{
                maxValue = maxright;
            }
            if(root.val > maxValue){
                maxValue= root.val;
            }
        }
        return maxValue;
    }
 */
    public static int maxValueInBT(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int maxLeft = maxValueInBT(root.left);
        int maxRight = maxValueInBT(root.right);
        return Math.max(root.val, Math.max(maxLeft, maxRight));
    }


    public static void main(String[] args) {
        // {1,2,3,4,5,6,7} -- binary tree values
        TreeNode root = new TreeNode(19);
        root.left = new TreeNode(200);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(34);
        root.left.right = new TreeNode(1005);
        root.right.left = new TreeNode(68);
        root.right.right = new TreeNode(53);

        // System.out.println("Binary tree input values are: 1, 2, 3, 4, 5, 6, 7");
        int result = maxValueInBT(root);
        System.out.println(result);
    }
}
