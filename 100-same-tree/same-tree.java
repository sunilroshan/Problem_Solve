/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null){
            return true;
        }

        // if(p.val != q.val || p == null || q == null){ ---> gives error because first check the node and then only data
         if(p == null || q == null || p.val != q.val){
            return false;
        }

        //first i have return like this

        // return isSameTree(p.left, q.left);
        // return isSameTree(p.right, q.right); // ❌ Unreachable statement

        else{
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);  //If both return true, only then the entire tree or subtree is considered the same.

        }
        
      
    }
}