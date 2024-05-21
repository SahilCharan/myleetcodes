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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root,list);


        int min= Integer.MAX_VALUE;
        for(int i=1;i<list.size();i++)
        {

            min = Math.min(min,Math.abs(list.get(i)-list.get(i-1)));
            if(min==1)
            return 1;
        }
        return min;

    }
    private void dfs(TreeNode root,ArrayList<Integer> list){
        
        if(root==null) return;
        
        dfs(root.left,list);
        list.add(root.val);
        dfs(root.right,list);

    }
}