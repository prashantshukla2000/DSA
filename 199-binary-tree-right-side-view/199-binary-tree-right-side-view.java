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
        HashMap<Integer,Integer> map=new HashMap();
        dfs(root,0,map);
        List<Integer> lst=new ArrayList();
      for(Map.Entry<Integer,Integer> entry:map.entrySet())
      {
          lst.add(entry.getValue());
      }
        return lst;
    }
   public void dfs(TreeNode root,int height,HashMap<Integer,Integer> map){
        if(root==null)
            return;
        map.put(height,root.val);
       dfs(root.left,height+1,map);
       dfs(root.right,height+1,map);
   }
}