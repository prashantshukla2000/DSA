class Solution {
    public int minimumEffortPath(int[][] heights) {
int m =heights.length;
        int n=heights[0].length;
int inf =Integer.MAX_VALUE;
    int effort[][]=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(effort[i],inf);
        }
       effort[0][0]=0;
        int dir[][]=new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        //dist,row,col
  PriorityQueue<int []> pq =new PriorityQueue<>((a,b)-> a[0]-b[0]);
    pq.add(new int[]{0,0,0});
while(!pq.isEmpty()){
    int min[]=pq.poll();
    int dist=min[0],row=min[1],col=min[2];
    if(dist>effort[row][col])continue;//if this distance >what is already present to get to that place we do nothing
    if(row==m-1&&col==n-1) return dist;// if we are at last cell we return the dist
    //else we need to go in each direcion for an element relaxation
    for(int d[]:dir){
        int newrow=row+d[0];
        int newcol=col+d[1];
        if(newrow>=0&& newrow<m&& newcol>=0&& newcol<n)//if the block are part of the matrix then find the new dist
        {
          int  newdist=Math.max(dist,Math.abs(heights[newrow][newcol]-heights[row][col]));
        
        //Now if update only if it is less that that in the effort matrix already
        if(newdist<effort[newrow][newcol]){
            effort[newrow][newcol]=newdist;
            pq.add(new int[]{newdist,newrow,newcol});
        }
        }
    }
}
        return 0;
    }
}