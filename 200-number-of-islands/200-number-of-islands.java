class Solution {
    int row=0;
    int col=0;

    public int numIslands(char[][] grid) {
    if(grid.length==0)
        return 0;
         row=grid.length;
         col=grid[0].length;
       int count=0;
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1' &&!set.contains(Arrays.asList(i,j))){
                     queue.offer(new int[] {i,j});
                    set.add(Arrays.asList(i,j));
                    bfs(queue,grid,set);
                    count+=1;
                }
            }
        }
        return count;
    }
       public void bfs(Queue<int[]> queue,char [][]grid,Set<List<Integer>> set)
    {
           
            while(!queue.isEmpty()){      //while we have not explored the whole path
                int[] temp=queue.remove(); 
                int r=temp[0];
                int c=temp[1];
                 int [][]dir=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
                for(int d[]:dir){
                    int dr=d[0];
                    int dc=d[1];
if((r+dr <=row-1 &&r+dr>=0 )&&(c+dc <=col-1 &&c+dc>=0) && grid[r+dr][c+dc]=='1' &&!set.contains(Arrays.asList(r+dr,c+dc))){
                                         queue.add(new int[]{r+dr,c+dc});        
                                                             set.add(Arrays.asList(r+dr,c+dc));

                    }

       }

    }
       }
    

}