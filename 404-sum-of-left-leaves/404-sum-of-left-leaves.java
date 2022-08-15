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
    public int sumOfLeftLeaves(TreeNode root) {
        
    return (sumleaf(root,1));
}

public static int sumleaf(TreeNode root,int c){
if(root!=null){ 
    if(root.left!=null ||root.right!=null )            
       return sumleaf(root.left,0)+sumleaf(root.right,1);
   if(root.left==null &&root.right==null && c==0) 
   return root.val;         //in case they are leaf node
}
return 0;
}

}