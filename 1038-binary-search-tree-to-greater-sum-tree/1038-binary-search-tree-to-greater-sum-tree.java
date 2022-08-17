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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
        if(root==null) return root;
    TreeNode node=root;
        Stack <TreeNode> s=new Stack<>();
       while(!s.isEmpty()||node!=null){
           while(node !=null){
               s.push(node);
               node=node.right;
           }
           node=s.pop();
           sum=sum+node.val;
           node.val=sum;
           node=node.left;
       }

         return root;
    }
}