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
    long prev;
    public boolean isValidBST(TreeNode root) {
        prev=Long.MIN_VALUE;
   return  dfs(root);
    }
    public boolean dfs(TreeNode root){
        if(root!=null){
            if(dfs(root.left)==false)
                return false;
            if(prev>=root.val)
                return  false;
            prev=root.val;
             if(dfs(root.right)==false)
                return false;
            return true;
        }return true;
    }
}