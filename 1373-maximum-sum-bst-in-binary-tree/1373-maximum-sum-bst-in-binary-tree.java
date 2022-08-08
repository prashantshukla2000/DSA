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
    int msum=0;
   
    public int maxSumBST(TreeNode root) {
        f(root);
       return msum; 
    }
    public int[] f(TreeNode root){
        if(root==null){
            return new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE,0};
        }
        int left[]=f(root.left);
        int right[]=f(root.right);
        if(root.val>left[1]&&root.val<right[0]){
        msum=Math.max(msum,left[2]+right[2]+root.val);
        int min=Math.min(left[0],root.val);
        int max=Math.max(right[1],root.val);
        int sum=left[2]+right[2]+root.val;
        return new int[]{min,max,sum};
        
        }else{
            return new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE,0};
        }
    }
}