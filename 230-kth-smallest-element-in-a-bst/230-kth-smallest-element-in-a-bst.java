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
    int i=0;
   int n;
    public int kthSmallest(TreeNode root, int k) {
        if(root!=null){
             kthSmallest( root.left,k) ;
            i=i+1;
            if(i==k){
                n=root.val;
            }
             kthSmallest( root.right,k) ;
        }
        return n;
    }
}