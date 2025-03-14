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
    public boolean findTarget(TreeNode root, int k) {

         ArrayList<Integer> l = new ArrayList<>();
        inorder(root,l);
        
        int i = 0;
        int j = l.size() - 1;
        
        while(i < j){
            
            int sum = l.get(i) + l.get(j);
            
            if(sum < k){
                i++;
            }
            else if(sum > k){
                j--;
            }
            else if(sum == k){
                return true;
            }
        }
        
        return false;
    }
    public static void inorder(TreeNode root, ArrayList<Integer> l){
        
        if(root != null){
            inorder(root.left,l);
            l.add(root.val);
            inorder(root.right,l);
        }
    }
        
    }
