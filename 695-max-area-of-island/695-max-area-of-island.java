class Solution {
   
    int ro=0,co=0;
    int m=0,max=0;
    public int maxAreaOfIsland(int[][] grid) {
       
        int c=0;ro=grid.length;co=grid[0].length;
        for(int i=0;i<ro;i++){
            for(int j=0;j<co;j++){
               if(grid[i][j]==1){
                   m=0;
                   dfs(grid, i, j);
               }
            }
        }
        return max;
    }
    public void dfs(int[][] grid,int r, int c){
        if(r<0||c<0||r==ro||c==co||grid[r][c]==0)
            return;
        grid[r][c]=0;
        m++;
       
        dfs(grid,r+1,c);
        dfs(grid,r-1,c) ;
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
       max=Math.max(m,max);
    }
}
    
  