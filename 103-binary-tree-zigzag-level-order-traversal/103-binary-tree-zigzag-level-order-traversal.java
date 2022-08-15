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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
                           List<List<Integer>> sol=new ArrayList<>();
        if(root==null)
                    return sol;
       Queue<TreeNode> queue=new LinkedList<>();
       queue.add(root);
        boolean lefttoright=true;
        while(!queue.isEmpty()){
            int size=queue.size();
            List<Integer> row=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.remove();  
                   if(lefttoright){
                    row.add(node.val);
                }else{
                   row.add(0,node.val);
                }       
                
                if(node.left!=null)
                    queue.add(node.left);
                 if(node.right!=null)
                    queue.add(node.right);  
            }
            lefttoright=(!lefttoright);
            sol.add(row);
        }
    return sol;
    }
}
         