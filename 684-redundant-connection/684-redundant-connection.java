class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int parent[]=new int [1001];
        for(int i=0;i<1001;i++){ // weset each parent for every element as node itself initially
            parent[i]=i;
        }
        for (int edge[] :edges){
            int node_a=edge[0];
            int node_b=edge[1];
            int par_a=node_a;
            int par_b=node_b;
            while(par_a!=parent[par_a]){
                par_a=parent[par_a];
            }
             while(par_b!=parent[par_b]){
                par_b=parent[par_b];
            }
            if(par_a!=par_b)//means we have two disconnected forests
            {
                parent[par_a]=par_b; //we join them by setting the parent of frst node to that of second
            }else{ //it means it is redundat that it has already occured and will form a loop
                return edge;
            }
        }
        return new int[2];
    }
}