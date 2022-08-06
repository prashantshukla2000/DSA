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
      return  f(root,p,q);

    }
    public TreeNode f(TreeNode root, TreeNode p, TreeNode q) {
        if (root!=null){
            if(root.val>=p.val && root.val<=q.val)
                return root;
            if(q.val<root.val)
                return f(root.left,p,q);
             return f(root.right,p,q);
        }
        return null;
    }
}