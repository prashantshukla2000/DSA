class Solution {
  public boolean exist(char[][] board, String word) {
        boolean seen[][] = new boolean[board.length][board[0].length];
        for(int i = 0;i<board.length;i++)
            for(int j = 0;j<board[i].length;j++)
            {
                if(dfs(board,word,seen,i,j,0))
                    return true;
            }
        return false;
    }
    public boolean dfs(char[][] board, String word, boolean seen[][], int r, int c, int i){
        boolean res=false;
        if(i==word.length()) {  //we got the whole string so true
                 return true;}
        if(r<0 || r>=board.length ||  c<0 ||c>=board[0].length||board[r][c] !=word.charAt(i)||seen[r][c]){
            return false;
        }
     seen[r][c]=true;    //we set that element as visted
        //now we ned to call it for all four sides 
        res=((dfs(board,word, seen,r+1, c,i+1))||(dfs(board,word, seen,r-1, c,i+1))||(dfs(board,word,seen,r, c+1,i+1))||(dfs(board,word,seen,r, c-1,i+1)));
       
       if(res)
            return true;
        seen[r][c] = false; // if not positive output we set that ele from visited array to unvisted
        return false;
        }
}