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
    private int moves;
    public int distributeCoins(TreeNode root) {
        moves=0;
        dfs(root);
        return moves;
    }
    private int dfs(TreeNode curr)
    {
        if(curr == null)
        return 0;
        //calculating no coins each subtree has avilable t0 exchnge

        int leftcoins = dfs(curr.left);
        int rightcoins = dfs(curr.right);

//Add the total number of exchange to moves
        moves+= Math.abs(leftcoins)+Math.abs(rightcoins);

        // the total number of coins current has avilable to exchange

        return (curr.val -1)+leftcoins+rightcoins;


    }
}