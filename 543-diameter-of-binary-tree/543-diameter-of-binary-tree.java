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
    public int diameterOfBinaryTree(TreeNode root) {
       return p(root)[0]-1; 
    }
    public int[] p(TreeNode root){
        if(root!=null){
            int left[]=p(root.left);
            int right[]=p(root.right);
            
            int path=Math.max(1+left[1]+right[1],Math.max(left[0],right[0]));
            int height=Math.max(left[1],right[1])+1;
            return  new int[]{path,height};
        }
        return new int[]{0,0};
    }
}