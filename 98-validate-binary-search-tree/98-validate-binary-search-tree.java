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
   long prev=Long.MIN_VALUE; 
    public boolean isValidBST(TreeNode root) {
      
        if(f(root)==true)return true;
        return false;
            
    }
     public boolean f(TreeNode root){
         if(root!=null){
             if((f(root.left))==false)
                 return false;
             if(prev>=root.val)
                 return false;
             prev=root.val;
              if(f(root.right)==false)
                 return false;
             return true;
         }
         return true;
     }
    
}