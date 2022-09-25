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
    HashMap<Integer,Integer> map=new HashMap();//for inorder
    int pre[];//for preorder
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre=preorder;
        for(int i=0;i<inorder.length;i++){
           map.put(inorder[i],i);
        }
       return dfs(0,inorder.length-1,0,preorder.length-1);
    }
        
      public TreeNode  dfs(int instart,int inend,int prestart,int preend){
        int index=map.get(pre[prestart]);
          int  l=index-instart;
         int  r=inend-index;
          TreeNode root=new TreeNode(pre[prestart]);
          if(l!=0){
              root.left=dfs(instart,index-1,prestart+1,prestart+l);
          }else
              root.left=null;
          if(r!=0)
              root.right=dfs(index+1,inend,prestart+l+1,preend);
          else
              root.right=null;
          
          return root;
        
    }
}