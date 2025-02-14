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
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        while (!q.isEmpty()) {

            int size = q.size();

            List<Integer> data = new ArrayList<>();

            while (size-- > 0) {
                TreeNode current = q.poll();
                data.add(current.val);
                if (current.left != null) {
                    q.add(current.left);
                }
                if (current.right != null) {
                    q.add(current.right);
                }
            }

            ans.add(data);
        }

        return ans;

    }
}