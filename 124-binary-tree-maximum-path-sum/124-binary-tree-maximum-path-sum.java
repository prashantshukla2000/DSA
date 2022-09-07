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
//We can only split once as we can only follow one path ie, fr the main parent of the path it can go left and right ,but it its children have to follow either a left path or an right path(maximum of two) ..or just include the root if includng children will make it negative so we check if it makes the sum smaller than 0 then we ignore its children
//....but the overall result can be any node which on splitting can give the maximum result so it will be node.val +leftsum+rightsum and it will declared as an lobal variable to reduce calling it every time....in order to choose in negative no we choose the b/w 
//Time...0(n)
class Solution {
    int result;
    public int maxPathSum(TreeNode root) {
    result=Integer.MIN_VALUE;
       dfs(root);
    return result;
    }
   public int dfs(TreeNode root){
        if(root==null)
            return 0;
      int left=Math.max(0,dfs(root.left));
      int right=Math.max(0,dfs(root.right));
       int leftright=Math.max(left,right);
      
       //computing the maxpath result withhout the split
       result=Math.max(result,left+right+root.val);
       
       //computing return value for the functin with the split as it can follow only one path for its parent.
      return leftright+root.val;
    }
}