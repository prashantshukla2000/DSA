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
    public void flatten(TreeNode root) {
        dfs(root);
    }
     public TreeNode dfs(TreeNode root){
         if(root==null)
             return null;
      TreeNode leftTail=  dfs(root.left);
       TreeNode rightTail =   dfs(root.right);
         //if left side is empty but right side is not, we dont have to do anything.
         //if left side is not null and right side is null,we have to insert it to the right side.
         if(leftTail!=null){
          leftTail.right=root.right;//aataching the left tail to the right side;
         root.right=root.left;//the first element for the right side of the root will be its left child;
         root.left=null; //we set the right left pointer of all nide to null;
         }
        TreeNode last=root;
         if(rightTail!=null)
          last=rightTail;
         else if(rightTail==null &&leftTail!=null)
             last=leftTail;
        
         return last;
     }
}