class Solution {
    int row,col;
    public int longestIncreasingPath(int[][] matrix) {
        row=matrix.length;col=matrix[0].length;
        HashMap<String,Integer> map=new HashMap<>();//could also use 2d marix
 for(int i=0;i<matrix.length;i++){
     for(int j=0;j<matrix[0].length;j++){
      dfs(i,j,-1,map,matrix);
     }
 }
        return (Collections.max(map.values()));

    }

    public int dfs(int r ,int c,int parent,  HashMap<String,Integer> map,int [][] matrix){
        if(r<0||r==row||c<0||c==col||matrix[r][c]<=parent)
            return 0;
        String key=r+"-"+c;
        if(map.containsKey(key))
            return map.get(key);
        parent=matrix[r][c];
        int top=dfs(r+1,c,parent,map,matrix);
                int left=dfs(r,c+1,parent,map,matrix);
                int right=dfs(r,c-1,parent,map,matrix);
        int bottom=dfs(r-1,c,parent,map,matrix);
    int  count=1+Math.max(Math.max(left,right),Math.max(top,bottom));
        map.put(key,count);
        return count;
    }
}