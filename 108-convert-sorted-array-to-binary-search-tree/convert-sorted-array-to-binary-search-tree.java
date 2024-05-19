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
    public TreeNode sortedArrayToBST(int[] nums) {
        int low =0,high = nums.length-1;
        TreeNode root = BuildTree(nums,low,high);
        return root;
        
    }

    public TreeNode BuildTree(int[] n,int l, int h)
    {
        if(l>h)
        return null;
        int mid  = l+(h-l)/2;
        
        TreeNode r = new TreeNode(n[mid]);
        
        
        r.left = BuildTree(n,l,mid-1);
        r.right = BuildTree(n,mid+1,h);

        return r;
    }
}