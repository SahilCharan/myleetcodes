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
    int sum =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        postorder(root);
        return sum;
    }
    public int postorder(TreeNode root)
    {
        if(root == null)
        return 0;

        int lsum = postorder(root.left);
        // i dont want negative values.
        if(lsum<0)
        lsum =0;
        int rsum = postorder(root.right);
         if(rsum<0)
        rsum =0;

        
        sum =  Math.max(sum,lsum+rsum+root.val);

        return root.val+Math.max(lsum,rsum);
    }
}