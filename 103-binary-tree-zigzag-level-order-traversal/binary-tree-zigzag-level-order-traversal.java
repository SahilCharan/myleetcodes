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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> list = new ArrayList<>();
        int c = 0;
        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr == null) {
                c++;
                if (!list.isEmpty()) {
                    ans.add(list);
                    list = new ArrayList<>();
                }

                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                if (c % 2 == 0) {
                    list.add(curr.val);
                } else {
                    list.add(0, curr.val);
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }

        return ans;
    }

}
