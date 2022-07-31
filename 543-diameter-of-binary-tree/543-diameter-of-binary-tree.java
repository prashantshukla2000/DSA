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
        return f(root)[0]-1;
    }
    public int[] f(TreeNode root ){
        if(root!=null){
         int[] left = f(root.left);
        int[] right = f(root.right);
           int path=Math.max(Math.max(left[0] ,right[0]),1+left[1]+right[1]);
            int height = 1 + Math.max(left[1], right[1]); 
            return new int[]{path,height};
        }
        return new int[]{0,0};
        
    }
}