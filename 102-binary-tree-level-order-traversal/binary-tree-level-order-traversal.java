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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>>list = new ArrayList<>();
        //list khali hai to return kr do khali
        if(root == null)
        return list;

        //q mein root ko add kr do, or level ko partiion krke k liye null add kr dete h

        q.add(root);
        q.add(null);
        List<Integer>l = new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr = q.poll();
            if(curr==null){
                //curr yadi null hai to dekho ab hoga jadu
                // pehle list ko add kr do answer list mein or fir l mein naya level dalne k liye naya list ho uske liye usko khali kr do
                list.add(l);
                l= new ArrayList<>();

                if(!q.isEmpty())
                {
                    q.add(null);
                }
            }
            else{
                l.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
        return list;

    }
}