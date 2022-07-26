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
    public List<Integer> postorderTraversal(TreeNode root) {
  List<Integer> al=new ArrayList<Integer>();
        postorder(root,al);
        return al;
    }
    public void postorder(TreeNode root,List<Integer> al){
      if (root==null)
      {return;
      }
        postorder(root.left,al);
        postorder(root.right,al);
        al.add(root.val);
     
    }
}
