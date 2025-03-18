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
// class Solution {
//     public int kthSmallest(TreeNode root, int k) {
       
//        return  helperfunction(root,k,0);
        
        
//     }

//     public int helperfunction(TreeNode root, int k, int ans,int count){

//         if(root == null){
//             return 0;
//         }

//         return helperfunction(root.left,k,ans,count);
//         count++;
//         if(count == k){
//             ans = root.val;
//             return ans;
//         }
//         return helperfunction(root.right,k,ans,count);
        
//     }
// }

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        int[] ans = new int[1];
        f(root, k, new int[]{0}, ans);
        return ans[0];
    }
    public void f(TreeNode root, int k, int[] cnt, int[] ans) {
        if (root == null) return;
        f(root.left, k, cnt, ans);
        cnt[0] += 1;
        if (cnt[0] == k) ans[0] = root.val;
        f(root.right, k, cnt, ans);
    }
}
