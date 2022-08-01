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
    public List<Integer> rightSideView(TreeNode root) {
        HashMap<Integer,Integer> hm=new   HashMap<Integer,Integer>();
        f(root,0,hm);
        
        List<Integer> al =new ArrayList();
        
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            al.add(entry.getValue());
        }
        return al;
        
    }
    public void f(TreeNode root,int level,  HashMap<Integer,Integer> hm){
      if (root!=null){  hm.put(level,root.val);
        f(root.left,level+1,hm);
        f(root.right,level+1,hm);}

    }
}