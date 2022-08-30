import java.lang.reflect.Array;
import java.util.ArrayList;
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==(destination))
            return true;
        if(edges.length==0)
            return true;
        
        ArrayList<Integer>[] graph= makegraph(edges,n);
        return ConnectedGraphs(graph,source,destination);
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
    
    public static boolean ConnectedGraphs(ArrayList<Integer>[] graph,int source,int dest){
        HashSet<Integer> visitedNode=new HashSet<Integer>();
        Queue<Integer> nodeToVisit =new LinkedList<>();
        nodeToVisit.add(source);
        
        while(nodeToVisit.size()>0){
            int currentnode=nodeToVisit.poll();
            visitedNode.add(currentnode);
            for(int nextNode:graph[currentnode]){
                if(!visitedNode.contains(nextNode)){
                    if(nextNode==(dest)){
                        return true;}
               nodeToVisit.add(nextNode);

                }
            }
            
        }
        return false;
    }
}
 