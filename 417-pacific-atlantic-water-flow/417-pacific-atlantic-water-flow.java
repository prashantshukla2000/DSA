class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
      List<List<Integer>> res=new ArrayList<>();
        Set<List<Integer>> alt=new HashSet<List<Integer>>();
        Set<List<Integer>>pac= new HashSet<List<Integer>>();
        for(int r=0;r<heights.length;r++){
            dfs(pac,r,0,heights,heights[r][0]);
            dfs(alt,r,heights[0].length-1,heights,heights[r][heights[0].length-1]);
        }
        for(int c=0;c<heights[0].length;c++){
            dfs(pac,0,c,heights,heights[0][c]);
            dfs(alt,heights.length-1,c,heights,heights[heights.length-1][c]);
        }
        for(int r=0;r<heights.length;r++){
            for(int c=0;c<heights[0].length;c++)
            {    if(pac.contains(Arrays.asList(r,c))&&alt.contains(Arrays.asList(r,c))){
                    res.add(Arrays.asList(r,c));
                }

            }
        }
        return res;
        
    }
    public void dfs(Set<List<Integer>> set,int r,int c,int[][]heights,int prev)
    {
        if(r<0||c<0||r==heights.length||c==heights[0].length|| prev> heights[r][c] ||set.contains(Arrays.asList(r,c)))
            return;
        set.add(Arrays.asList(r,c));
        prev=heights[r][c];
        dfs(set,r+1,c,heights,prev);
        dfs(set,r-1,c,heights,prev);
        dfs(set,r,c+1,heights,prev);
        dfs(set,r,c-1,heights,prev);
        
    }
}