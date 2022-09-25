/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
     String splitter=",";
     String NN="X";
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
      StringBuilder sb=new StringBuilder();
        get(root,sb);
        return sb.toString();
    }
    public void get(TreeNode root,StringBuilder sb){
        if(root==null){
            sb.append(NN).append(splitter);
        }else{
            sb.append(root.val).append(splitter);
            get(root.left,sb);
            get(root.right,sb);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
           Deque<String> nodes=new LinkedList<>();
           nodes.addAll(Arrays.asList(data.split(splitter)));
           return buildStrings(nodes);
    }
    public TreeNode buildStrings(Deque<String> nodes){
        String val=nodes.remove();
        if(val.equals(NN))
            return null;
        else{
            TreeNode node=new TreeNode(Integer.valueOf(val));
            node.left=buildStrings(nodes);
            node.right=buildStrings(nodes);
            return node;
        }
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));