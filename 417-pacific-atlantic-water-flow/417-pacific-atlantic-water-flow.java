//prevheight for the first element is the element itself as height of new element should be equal or grater than the prevoius element which is touching the waters

class Solution {
    int row=0,col=0;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
     Set<List<Integer>> pac=new HashSet<>();
     Set<List<Integer>> atl=new HashSet<>();
     row=heights.length;
     col=heights[0].length;
        for(int c=0;c<col;c++){
            dfs(0,c,pac,heights[0][c],heights);//first column we dfs pass as it is closer to pacific so we reach all the elements we can from pacific from left side
            dfs(row-1,c,atl,heights[row-1][c],heights);  //to add all ele in set we can reach from atlantic on the right side 
            
        }
               for(int r=0;r<row;r++){
            dfs(r,0,pac,heights[r][0],heights);//for all ele we can reach from pacific from the top side
            dfs(r,col-1,atl,heights[r][col-1],heights); //for all ele from atlantic from the top side 
            
        }
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                if(pac.contains(Arrays.asList(r,c))&&atl.contains(Arrays.asList(r,c)))
                   res.add(Arrays.asList(r,c)) ;
            }
        }
        return res;
    }
    public void dfs(int r, int c,Set<List<Integer>> set,int prevHeight,int[][] heights){
        if(r<0 ||c<0 ||r>=row||c>=col||heights[r][c]<prevHeight ||set.contains(Arrays.asList(r,c)))
            return ;
        set.add(Arrays.asList(r,c));
        dfs(r+1,c,set,heights[r][c],heights);
           dfs(r-1,c,set,heights[r][c],heights);
           dfs(r,c+1,set,heights[r][c],heights);
           dfs(r,c-1,set,heights[r][c],heights);
    }
}