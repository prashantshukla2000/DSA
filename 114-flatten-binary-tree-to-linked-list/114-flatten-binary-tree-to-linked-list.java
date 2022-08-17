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
        ArrayList<TreeNode> al=new ArrayList<>();
    public void flatten(TreeNode root) {
        increasingBST(root);
    }

    public void inorder(TreeNode root)
    {
        if(root==null)
            return;
        al.add(root);
        inorder(root.left);
         inorder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
       if(root==null)
           return null;
     inorder(root);
      
        
        for(int i=0;i<al.size()-1;i++){
            
            al.get(i).right=al.get(i+1);
            al.get(i).left=null;
        }
         al.get(al.size()-1).left=null;
         al.get(al.size()-1).right=null;

        return al.get(0);
    }}
