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
    public void dfs(TreeNode node, int val, int depth, int currdepth)
    {
        if(node == null)
        return ;
        if(currdepth<depth-1)
        {
            dfs(node.left,val, depth,  currdepth+1);
            dfs(node.right, val,  depth,currdepth+1);
        }
        if(currdepth == depth-1)
        {
            TreeNode newLeft = new TreeNode(val);
            TreeNode newRight = new TreeNode(val);
            TreeNode exLeft = node.left;
            TreeNode exRight = node.right;

            node.left = newLeft;
            newLeft.left = exLeft;

            node.right = newRight;
            newRight.right = exRight;
            
        }
    }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode newNode = new TreeNode(val);
            newNode.left = root;
            return newNode;
        }
        dfs(root,val,depth, 1);
        return root;
    }
}