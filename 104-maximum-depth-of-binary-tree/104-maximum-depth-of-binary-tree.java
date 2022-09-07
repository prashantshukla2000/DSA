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
    public int maxDepth(TreeNode root) {
        int level=0;
        if(root == null)
             return level;
       Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
             level=level+1;
           int i=q.size();
              while(i>0){
                TreeNode node=q.poll();
                 if(node.left!=null)
                   q.add(node.left);
                   if(node.right!=null)
                   q.add(node.right);
                  i--;
              }
        }
        return level;
    } 
}
   