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
    public TreeNode bstToGst(TreeNode root) {
        //We use reverse Inorder
        if(root==null)
         return null;
        int sum=0;
        TreeNode node=root;
        while(node!=null){
            //no right tree
          if(node.right==null){
              sum=sum+node.val;
              node.val=sum;
              node=node.left;//We mve our pointer to the left side
          }  //right tree present
        else{
          TreeNode succ=nextGreaterValue(node);  
            
            //left is null ,ie, it is unvisited.
            if(succ.left==null){
                succ.left=node;
                node=node.right;
            }
            else{            //left is not null--visited
                     succ.left=null;
                   sum=sum+node.val;
                node.val=sum;
                node=node.left;
            }
        }
        } 
         return root;
    }
  public TreeNode  nextGreaterValue(TreeNode node){
      TreeNode succ=node.right;
      while(succ.left!=null&& succ.left!=node){
          succ=succ.left;
      }
      return succ;
  }
}