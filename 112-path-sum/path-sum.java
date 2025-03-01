/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return false;
        }

        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> sum = new LinkedList<>();

        q.add(root);
        sum.add(root.val);

        while (!q.isEmpty()) {

            TreeNode temp = q.poll();
            int value = sum.poll();

            if (value == targetSum && temp.left == null && temp.right == null) {
                return true;
            }

            if(temp.left != null){
                q.add(temp.left);
                sum.add(temp.left.val + value);
            }

            if(temp.right != null){
                q.add(temp.right);
                sum.add(temp.right.val + value);
            }
        }

        return false;

    }
}