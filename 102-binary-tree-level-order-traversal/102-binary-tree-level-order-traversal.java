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
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        Queue<TreeNode> queue =new LinkedList<TreeNode>();
        if(root==null)
            return res;
        queue.offer(root);
        while(!queue.isEmpty()){
            int level=queue.size();
              List<Integer> ans=new ArrayList<>();
              for(int i=0;i<level;i++){
                TreeNode temp=queue.poll();
               ans.add(temp.val);       

                if(temp.left!=null)
                             queue.add(temp.left);
                 if(temp.right!=null)
                             queue.add(temp.right);
                
            }
            res.add(ans);
        }
        return res;
    }
}