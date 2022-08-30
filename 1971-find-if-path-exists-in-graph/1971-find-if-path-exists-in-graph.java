import java.lang.reflect.Array;
import java.util.ArrayList;
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==(destination))
            return true;
        if(edges.length==0)
            return true;
        
        ArrayList<Integer>[] graph= makegraph(edges,n);
        return connectedGraphHasValue(source,destination,graph);
    }
    public ArrayList<Integer>[] makegraph(int [][]edges,int n){
        ArrayList<Integer>[] list= (ArrayList<Integer>[]) Array.newInstance(ArrayList.class,n);

        //intilliase with ArrayLists
        for(int i=0;i<n;i++){
            list[i]=new ArrayList<>();
    } 
      for(int []edge: edges){
          list[edge[0]].add(edge[1]);
          list[edge[1]].add(edge[0]);
      }

 return list;
}
    
  private boolean connectedGraphHasValue(Integer nodeValue, Integer searchValue,
            ArrayList<Integer>[] graph) {

        HashSet<Integer> visitedNodes = new HashSet<>();
        Queue<Integer> nodesToVisit = new LinkedList<>();
        nodesToVisit.add(nodeValue);

        // normally, we'd check here, but in this problem, no node connects to itself

        while (nodesToVisit.size() > 0) {
            Integer currentNode = nodesToVisit.poll();
            visitedNodes.add(currentNode);

            for (Integer nextNode : graph[currentNode]) {
                if (!visitedNodes.contains(nextNode)) {
                    // we can check here to save time
                    if (nextNode.equals(searchValue)) {
                        return true;
                    }

                    nodesToVisit.add(nextNode);
                }
            }
        }

        return false;
    }
}