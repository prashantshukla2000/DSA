class Solution {
    int row=0,col=0;
    public int numIslands(char[][] grid) {
        row=grid.length;col=grid[0].length;
        int count=0;
        for(int r=0;r<row;r++){
        for(int c=0;c<col;c++){
           if(grid[r][c]=='1') {
               dfs(grid,r,c);
            count++;}
        }            
        }
        return count;
    }
     public void dfs(char[][]grid,int r, int c){
        if(r<0||c<0||r==row||c==col||grid[r][c]!='1')
            return ;
          grid[r][c]='0';
         dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c+1);
        dfs(grid,r,c-1);
        
    }
}