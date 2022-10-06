class Solution {
   
    int ro=0,co=0;
    public int maxAreaOfIsland(int[][] grid) {
        int s=0,ma=0;
        int c=0;ro=grid.length;co=grid[0].length;
        for(int i=0;i<ro;i++){
            for(int j=0;j<co;j++){
               if(grid[i][j]==1){
                   ma =Math.max(dfs(grid, i, j),ma);
               }
            }
        }
        return ma;
    }
    public int dfs(int[][] grid,int r, int c){
        if(r<0||c<0||r==ro||c==co||grid[r][c]==0)
            return 0;
        grid[r][c]=0;
       return 1+ dfs(grid,r+1,c)+dfs(grid,r-1,c) +dfs(grid,r,c+1)+ dfs(grid,r,c-1);
 
    }
}
    
  