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
    HashMap<Integer,Integer> hm=new  HashMap<Integer,Integer>();
    int []pre;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pre=new int[preorder.length];
        pre=preorder;
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return gettree(0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode gettree(int prestart,int preend,int instart, int inend){
        int inoindex=hm.get(pre[prestart]);
       int l=inoindex-instart;
       int r=inend-inoindex;
      TreeNode root = new TreeNode(pre[prestart]);
        if(l!=0)
        root.left=gettree(prestart+1,prestart+l,instart,inoindex-1);
        else
            root.left= null;
        
          if(r!=0)
        root.right=gettree(prestart+1+l,preend,inoindex+1,inend);
        else
            root.right= null;
        return root;
    }
    
}