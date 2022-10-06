/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null)
            return null;
        HashMap<Node,Node> oldtonew=new HashMap<>();
       return dfs(node,oldtonew);
    }
public Node dfs(Node node,HashMap<Node,Node> oldtonew){
    if(oldtonew.containsKey(node))
        return oldtonew.get(node);
    Node copy=new Node(node.val);
    oldtonew.put(node,copy);
    for(Node i:node.neighbors){
        copy.neighbors.add(dfs(i,oldtonew));
    }
    return copy;
}
}