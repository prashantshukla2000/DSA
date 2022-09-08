/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(q.val<p.val){
            TreeNode temp=q;
            q=p;
            p=temp;
        }
        return dfs(root,p,q);
            
        }
        public TreeNode dfs(TreeNode root, TreeNode p, TreeNode q){
            if(root!=null){
                if(p.val<=root.val&&q.val>=root.val){
                    return root;
                }
                if(q.val<root.val)
                  return  dfs(root.left,p,q);
              else
                return  dfs(root.right,p,q);
            }return null;
        }
    
}