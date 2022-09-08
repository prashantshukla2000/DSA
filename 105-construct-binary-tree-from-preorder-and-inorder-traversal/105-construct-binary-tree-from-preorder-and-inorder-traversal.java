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
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    int pre[];
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre=preorder;
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
       return helper(0,preorder.length-1,0,preorder.length-1);
    }
   public TreeNode  helper(int prestart,int preend ,int instart,int inend){
       int index=hm.get(pre[prestart]);
       int l=index-instart;
       int r=inend-index;
       TreeNode root=new TreeNode(pre[prestart]);
       if(l!=0){
          root.left= helper(prestart+1,prestart+l,instart,index-1);
           
       }else{
           root.left=null;
       }
              if(r!=0){
          root.right= helper(prestart+l+1,preend,index+1,inend);
           
       }else{
           root.right=null;
       }
       return root;
   }
}