class Solution {
    int row=0,col=0;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        row=heights.length;
        col=heights[0].length;
        Set<List<Integer>> pac=new HashSet<List<Integer>>();
        Set<List<Integer>> alt=new HashSet<List<Integer>>();
        for(int c=0;c<col;c++){
        dfs(heights,0,c,pac,heights[0][c]);
          dfs(heights,row-1,c,alt,heights[row-1][c]);
        }
        for(int r=0;r<row;r++){
            dfs(heights,r,0,pac,heights[r][0]);
            dfs(heights,r,col-1,alt,heights[r][col-1]);
        }
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(pac.contains(Arrays.asList(r,c))&&alt.contains(Arrays.asList(r,c))){
                    result.add(Arrays.asList(r,c));
                }
            }
                   }
        return result;
        }

    
    public void dfs(int[][]heights,int r, int c, Set<List<Integer>> set,int prevheight){
        if(r<0||c<0||r==row||c==col||set.contains(Arrays.asList(r,c))||prevheight>heights[r][c])
            return ;
        set.add(Arrays.asList(r,c));
        dfs(heights,r+1,c,set,heights[r][c]);
        dfs(heights,r-1,c,set,heights[r][c]);
        dfs(heights,r,c+1,set,heights[r][c]);
        dfs(heights,r,c-1,set,heights[r][c]);
        
    }
}