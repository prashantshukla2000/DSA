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
class Pair{
    TreeNode node;
    boolean check;
    int level;
    Pair(TreeNode _node,boolean _check,int _level){
        node=_node;
        check=_check;
        level=_level;
    }
}
class Solution {
    public boolean isBalanced(TreeNode root) {
    return f(root).check;  
    }
    public Pair f(TreeNode root){
        if(root==null)
            return (new Pair(root,true,0));
    
        Pair left=f(root.left);
        Pair right=f(root.right);
        boolean balanced=false;
    if(left.check==true &&right.check==true &&Math.abs(left.level-right.level)<=1)
        balanced=true;
        return new Pair(root,balanced,Math.max(left.level,right.level)+1);
        
    
    }
}