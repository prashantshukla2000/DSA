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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> ans1=new ArrayList<>();
       ans1= f(root1,ans1);
          ArrayList<Integer> ans2=new ArrayList<>();
       ans2= f(root2,ans2);
   
       return  ans1.equals(ans2);
    }
    public ArrayList<Integer> f(TreeNode root,ArrayList<Integer> al){
        if(root!=null){
            if(root.left==null&&root.right==null)
            al.add(root.val);
            f(root.left,al);
            f(root.right,al);
        }
        return al;
    }
}