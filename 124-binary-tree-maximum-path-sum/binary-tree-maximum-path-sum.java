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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root==null)
        return 0;
        findsum(root);
        return maxSum;
        
    }
    int findsum(TreeNode root){
        if(root==null)
        return 0;

        int lsum = findsum(root.left);
        if(lsum<0)
        lsum =0;

        int rsum = findsum(root.right);
        if(rsum<0)
        rsum =0;

        maxSum = Math.max(lsum+rsum+root.val,maxSum);

        return root.val+Math.max(lsum,rsum);


    }

}