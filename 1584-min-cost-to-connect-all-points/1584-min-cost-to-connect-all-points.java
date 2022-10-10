class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;int ans=0;
      PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[0]-b[0]); 
        for(int i=0;i<n;i++)//run for all nodes node 0,node 1..node n
        {
            for(int j=i+1;j<n;j++){//calculating the mmanhatten dist for nodes in point
                 pq.add(new int[]{ Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]), i, j });  
                
            }
        }
        int parent[]=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        while(n>1){
          int a[]=  pq.poll();
            int dist=a[0];
            int i=a[1];
            int j=a[2];
            int par_i=parent[i];
            int par_j=parent[j];
            while(parent[par_i]!=par_i)par_i=parent[par_i];
            while(parent[par_j]!=par_j)par_j=parent[par_j];
            if(par_i!=par_j){
                parent[par_i]=par_j;
                ans=ans+dist;
                 n--;
            }
        }
        return ans;

    }
}