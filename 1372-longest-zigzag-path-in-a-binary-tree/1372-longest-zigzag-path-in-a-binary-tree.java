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
    public int longestZigZag(TreeNode root) {
        return f(root,0,true);
        
    }
    public int f(TreeNode root, int k,boolean isleft){
        if(root!=null){
            if(isleft==true){
                return Math.max(f(root.left,1,true),f(root.right,k+1,false));
            }else{
                  
                return Math.max(f(root.left,k+1,true),f(root.right,1,false));
            
            }
            
        }
        return k-1;
    }
}