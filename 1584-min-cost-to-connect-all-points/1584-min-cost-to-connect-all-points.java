class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n=points.length,ans=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
  pq.add(new int[]{ Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]), i, j }); //finding the distance b/w two points
            }
        }
        
        int parent[]=new int[n];//union find
         for(int i = 0; i < n; i++){
             parent[i] = i;
    }
        while(n>1){
             int[] edge = pq.poll();
            int dis=edge[0];
            int i=edge[1];
            int j=edge[2];
           int pari=parent[i];
             int   parj=parent[j];
            while(parent[pari]!=pari)
                pari=parent[pari];
          while(parent[parj]!=parj)
                parj=parent[parj];
            if(pari!=parj)
            {
                parent[pari]=parj;
                   ans+=dis;
                n--;
            }
         
        }
        return ans;
        
    }
}