class Solution {
    public boolean exist(char[][] board, String word) {
        boolean seen[][]=new boolean[board.length][board[0].length];
      for(int i=0;i<board.length;i++){
          for(int j=0;j<board[0].length;j++){
                 if( dfs(board,word,seen,i,j,0))
                    return true;
      }
      }
        return false;
    }
    public boolean dfs(char[][] board, String word, boolean [][] seen,int r,int c,int i){
       if(i==word.length())
           return true;
        if(r<0||c<0||r>=board.length||c>=board[0].length||seen[r][c]||board[r][c]!=word.charAt(i))
            return false;
        seen[r][c]=true;
      boolean res= dfs(board,word,seen,r+1,c,i+1)||dfs(board,word,seen,r-1,c,i+1)||dfs(board,word,seen,r,c+1,i+1)||dfs(board,word,seen,r,c-1,i+1);
   if(res) return true;
    seen[r][c]=false;
    return false;
    }
}