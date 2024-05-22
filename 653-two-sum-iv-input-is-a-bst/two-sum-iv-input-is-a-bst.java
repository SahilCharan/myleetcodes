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
    boolean res;
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        dfs(root, k,set);
        if(res)
        return true;
        else
        return false;


    }
    public void dfs(TreeNode root, int k,Set<Integer> set){
        if(root==null)
        return;
        

        int num = root.val;
        int compliment = k-num;

        if(set.contains(compliment)){
            res = true;
            return;
        }
        set.add(num);
        dfs(root.left,k,set);
        dfs(root.right,k,set);


        
    }
}