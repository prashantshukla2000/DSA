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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        return same(root.left,root.right);
    }
    public boolean same(TreeNode left,TreeNode right){
        if(left==null &&right==null)
            return true;
        if(left==null||right==null)
           return false;
        if (left.val==right.val &&same(left.left,right.right) &&same(left.right,right.left)){
     return true;
        }else{
            return false;
        }
        
        }
    
}