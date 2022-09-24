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
    int m=0;
    public int maxDepth(TreeNode root) {
     
        return  max(root);
    } public int max(TreeNode root) {
        if(root==null)
        return 0;
         return Math.max(max(root.left),max(root.right))+1;
}
    
}