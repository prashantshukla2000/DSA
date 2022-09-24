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
     
          int i=max(root,0);
        return m;
    } public int max(TreeNode root,int i) {
        if(root==null)
        return 0;
        m=Math.max(m,i+1);
        max(root.left,i+1);
        max(root.right,i+1);
        return i+1;
}
    
}