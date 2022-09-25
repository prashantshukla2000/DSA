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
    int count;
    public int goodNodes(TreeNode root) {
      dfs(root,root.val) ;
        return count;
    }
  public void  dfs(TreeNode root,int m){
        if(root==null)
            return;
         if(root.val>=m)
            count++;
       m= Math.max(root.val,m);
       dfs(root.left,m);
        dfs(root.right,m);
    }
}