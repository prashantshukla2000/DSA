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
       HashMap<Integer,Integer> hm=new HashMap<>();
        int post[];
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
     post=new int[postorder.length];
        post=postorder;
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        return gettree(0,postorder.length-1,0,inorder.length-1);  //calling the funcion
    }
    public TreeNode gettree(int poststart,int postend,int instart, int inend){
if(instart>inend||poststart>postend)
    return null;
        
              int inoindex=hm.get(post[postend]);                                                   
       int l=inoindex-instart;         //finding the no.of left elements
       int r=inend-inoindex;        //finding the no.of ight elements
     TreeNode root =new TreeNode(post[postend]);      
        if(l!=0)
root.left=gettree(poststart,poststart+l-1,instart,inoindex-1);
        else
            root.left= null;              
            
          if(r!=0)
        root.right=gettree(poststart+l,postend-1,inoindex+1,inend);                  
        else
            root.right= null; 
        return root;        //returning the whole tree.
    

        }
    
    }