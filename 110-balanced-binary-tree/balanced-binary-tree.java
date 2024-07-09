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
    public boolean isBalanced(TreeNode root) {
        if(root == null)
        return true;

        int lh = height(root.left);
        int rh = height(root.right);

        // if(lh ==-1 || rh ==-1)
        // return false;

        if(Math.abs(lh-rh)<2 && isBalanced(root.left)&&isBalanced(root.right))
        return true;
        
        
        return false;
        
    }
    public int height(TreeNode root)
    {
        if(root == null)
        return 0;

        int l = height(root.left);
        int r = height(root.right);

        // if(Math.abs(l-r)<3)
        // return -1;
        
        return Math.max(l,r)+1;

    }
}