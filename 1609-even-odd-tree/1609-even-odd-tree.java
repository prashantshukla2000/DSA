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
    public boolean isEvenOddTree(TreeNode root) {
     Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        int prev=0;
        boolean even=true;
        while(q.size()>1){
            TreeNode el=q.poll();
            if(el!=null){
                if(even==true){
                    if(el.val>prev &&(el.val%2!=0)){
                       prev=el.val;}
                       else{
                       return false;}
                }
            else{
                    if(el.val<prev &&(el.val%2==0)){
                       prev=el.val;}
                    else{
                       return false;}
            }
            if(el.left!=null)
                       q.add(el.left);
            if(el.right!=null)
                     q.add(el.right);
            }
            else{
                if(even==true){
                    even=false;
                }else{
                    even=true;
                }
                if(even){
                    prev=0;
                }else{
                    prev=1000000;
                }
                 q.add(null);   
            }
            
        }
        return true;
    }
                       }