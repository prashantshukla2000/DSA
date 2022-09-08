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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null &&subRoot!=null)
            return false;
        if(subRoot==null)
            return true;
        
          if (isSametree(root,subRoot))
              return true;
          else{
             return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
          }
    }
    public boolean isSametree(TreeNode t1,TreeNode t2){
        if(t1==null&&t2==null)
            return true;
                if(t1==null ||t2==null)
                    return false;
        if(t1.val==t2.val&&isSametree(t1.left,t2.left)&&isSametree(t1.right,t2.right))
            return true;
        else
            return false;

    }
}