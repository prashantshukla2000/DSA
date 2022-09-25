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
    int i=0,n;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root,k);
        return n;
    }
    public void dfs(TreeNode root,int k){
        if(root==null)
            return ;
        dfs(root.left,k);
        i++;
        if(i==k){
            n=root.val;
       }
        else{
        dfs(root.right,k);}
    }
}