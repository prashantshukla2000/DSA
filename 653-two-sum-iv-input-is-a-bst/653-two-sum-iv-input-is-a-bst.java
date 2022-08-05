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

//import javafx.util.Pair;

class Solution {
    
    private Pair<TreeNode, TreeNode> convertToDLL(TreeNode root) {
        if(root==null) return new Pair<TreeNode,TreeNode>(null,null);
        Pair<TreeNode, TreeNode> leftPr = convertToDLL(root.left);
        Pair<TreeNode, TreeNode> rightPr = convertToDLL(root.right);
        TreeNode head = (leftPr.getKey()==null?root:leftPr.getKey());
        TreeNode tail = (rightPr.getValue()==null?root:rightPr.getValue());
        if(leftPr.getValue()!=null) {
            leftPr.getValue().right=root;
            root.left=leftPr.getValue();
        }
        if(rightPr.getKey()!=null) {
            rightPr.getKey().left=root;
            root.right=rightPr.getKey();
        }
        return new Pair<>(head,tail);
    }
    
    private boolean findPair(TreeNode head, TreeNode tail, int k) {
        TreeNode i = head, j = tail; 
        while(i!=j) {
            if(i.val+j.val==k) return true;
            else if(i.val+j.val<k) i=i.right;
            else if(i.val+j.val>k) j=j.left;
        }
        return false;
    }
    
    public boolean findTarget(TreeNode root, int k) {
        Pair<TreeNode, TreeNode> pr = convertToDLL(root);
        return findPair(pr.getKey(),pr.getValue(), k);
    }
}