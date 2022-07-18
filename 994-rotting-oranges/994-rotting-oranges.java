class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid==null||grid.length==0)
            return 0;
        int row=grid.length,col=grid[0].length;
        int fresh=0,time=0;
        
         Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    queue.add(i);
                    queue.add(j);
                }
                if(grid[i][j]==1)
                    fresh++;
            }
        }
       
        if(fresh==0)
            return 0;
      
        int dirs[][]={{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int sz=queue.size();
            
            for(int i=0;i<sz;i=i+2){
            int r=queue.poll();
            int c=queue.poll();
                
            for(int dir[]:dirs){
                int nR=r+dir[0];
                int nC=c+dir[1];
                
                if(nR>=0&&nR<row && nC>=0&& nC<col && grid[nR][nC]==1){
                    grid[nR][nC]=2;
                    fresh--;
                    queue.add(nR);
                    queue.add(nC);
                   
                }
            }
            }time++;
        }
        if(fresh!=0)
            return -1;
        
        return time-1;
    }
}