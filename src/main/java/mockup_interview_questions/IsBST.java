package mockup_interview_questions;

import java.util.*;

import mockup_interview_questions.ZigZagTraversal.TreeNode1;

public class IsBST {

    public static boolean isValidBST(TreeNode1 root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean validate(TreeNode1 node, long min, long max) {
        if (node == null) return true;

        if (node.val <= min || node.val >= max) return false;

        return validate(node.left, min, node.val) && 
               validate(node.right, node.val, max);
    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(10, 
                                        new TreeNode1(2, new TreeNode1(5), new TreeNode1(15,
                                                                                                     new TreeNode1(8), new TreeNode1(9)   )), 
                                        new TreeNode1(30, new TreeNode1(4), new TreeNode1(7)));
        boolean result = isValidBST(root);

        System.out.println(result);
    }
    
}

/*
 * 
 *                10
 *          
 * 
 *      2                   30
 * 
 * 
 * 5          15     4               7
 *      8         9
*/
