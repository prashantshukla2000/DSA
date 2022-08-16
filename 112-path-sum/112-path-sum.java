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
    public boolean hasPathSum(TreeNode root, int targetSum) {
     return f(root,0,targetSum)   ;
    }
    public boolean f(TreeNode root, int sum,int targetSum)
    {
        if(root==null){
            return false;
        }
        sum=sum+root.val;
        if(root.left==null &&root.right==null){
            return sum==targetSum; 
            //will return true if is leafnode and sum==target ele will return false for that leafnode.
        }
           return f(root.left,sum,targetSum)|| f(root.right,sum,targetSum);
        //we are only looking for one true so we can put both of them in an or. 
        
    }
}