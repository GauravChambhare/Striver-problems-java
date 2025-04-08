

package mockup_interview_questions;

import java.util.*;

public class ZigZagTraversal {
    

    static class TreeNode1{
        int val;
        TreeNode1 left;
        TreeNode1 right;

        public TreeNode1(int val){
            this.val = val;
        }

        public TreeNode1(int val, TreeNode1 left, TreeNode1 right){
            this.val = val;
            this.left = left;
            this.right = right;
            
        }


    }

    public static List<List<Integer>> zigzag(TreeNode1 root){

        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root==null){ return result;}

        Queue<TreeNode1> queue = new LinkedList<TreeNode1>();
        queue.offer(root);
        boolean isleftToRight=true;
        while(!queue.isEmpty()){
            int n = queue.size();
            Deque<Integer> deque = new LinkedList<Integer>();
            for(int i=0; i<n; i++){
                TreeNode1 node = queue.poll();
                if(isleftToRight){
                    deque.addLast(node.val);
                }
                else{
                    deque.addFirst(node.val);
                }
                if(node.left!=null){ queue.offer(node.left);}
                if(node.right!=null){ queue.offer(node.right);}
            }
            result.add(new ArrayList<>(deque));
            isleftToRight=!isleftToRight;
        }

        return result;

    }


    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1, 
                                        new TreeNode1(2, new TreeNode1(5), new TreeNode1(6,
                                                                                                     new TreeNode1(8), new TreeNode1(9)   )), 
                                        new TreeNode1(3, new TreeNode1(4), new TreeNode1(7)));
        List<List<Integer>> result = zigzag(root);

        System.out.println(result);
    }

}

/*                  1
 *          
 * 
 *      2                   3
 * 
 * 
 * 5          6     4               7
 *      8         9
 * 
*/
