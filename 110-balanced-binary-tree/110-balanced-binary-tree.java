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
    public boolean isBalanced(TreeNode root) {
    
        Pair<Boolean,Integer> p=f(root); 
        System.out.println((boolean)p.getKey()+""+(int)p.getValue());
       return p.getKey();

    }
     public Pair<Boolean,Integer> f(TreeNode root){
         if(root==null){ return new Pair(true,0); }
            Pair left =f(root.left);
            Pair right =f(root.right);
            boolean balance=false;
if((boolean)left.getKey()==true&&(boolean)right.getKey()==true &&(Math.abs((int)left.getValue()-(int)right.getValue())<=1)){
                 balance =true;}
             return new Pair(balance,(Math.max((int)left.getValue(),(int)right.getValue())+1));       
     }
}