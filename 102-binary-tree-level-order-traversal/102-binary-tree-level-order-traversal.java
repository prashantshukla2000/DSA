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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        if( root==null) 
            return l;
        q.add(root);
      int curl=0;
        while(!q.isEmpty()){
        List<Integer> al=new ArrayList<Integer>();
         curl=q.size();
            for(int i=0;i<curl;i++){
                TreeNode peek=q.poll();
                al.add(peek.val);
                if(peek.left!=null)
                    q.add(peek.left);
                if(peek.right!=null)
                    q.add(peek.right);
            }
            l.add(al);
        }
        return l;
    }
}