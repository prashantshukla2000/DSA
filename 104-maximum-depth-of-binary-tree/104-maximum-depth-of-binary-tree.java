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
    public int maxDepth(TreeNode root) {
       if(root==null)return 0;
	Stack<TreeNode> s = new Stack<>();
	HashMap<TreeNode, Integer> hm = new HashMap<>();
	s.add(root);
	while(s.size()>0){
		TreeNode t = s.peek();
		if(t.left!=null&&!hm.containsKey(t.left)){
			s.add(t.left);
		}else if(t.right!=null&&!hm.containsKey(t.right)){
			s.add(t.right);
		}else{
			t = s.pop();
			int left = hm.getOrDefault(t.left,0);
			int right = hm.getOrDefault(t.right,0);
			hm.put(t,Math.max(left,right)+1);
		}
	}
	return hm.get(root);
    } 
}
   