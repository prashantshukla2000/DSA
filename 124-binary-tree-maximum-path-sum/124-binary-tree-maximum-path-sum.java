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
               int result;
    public int maxPathSum(TreeNode root) {
        result=Integer.MIN_VALUE;
                dfs(root);
        return result;
 
    }


    public int dfs(TreeNode root){
      if(root==null)
          return 0;
        
      int left=  dfs(root.left);
        left=Math.max(left,0);
               int right= dfs(root.right);
        right=Math.max(right,0);
      result =Math.max(result,left+right+root.val);
          return Math.max(left,right)+root.val;
    }
}
