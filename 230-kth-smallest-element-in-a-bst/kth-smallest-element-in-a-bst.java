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
    int result;
    public int kthSmallest(TreeNode root, int k) {
        result = 0;
        dfs(root, new int[] {k});
        System.gc();
        return result;
    }


    public void dfs(TreeNode root, int[] k) {
        if (root == null) return;

        dfs(root.left, k);
        k[0]--;

        if (k[0] == 0) {
            result = root.val;
            return;
        }

        dfs(root.right, k);
    }
}