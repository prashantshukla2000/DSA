class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        List<List<String>> res=new ArrayList();
        dfs(board,res,0);
        return res;
    }
    public void dfs(char[][]board, List<List<String>> res,int i){
        if(i==board.length){
            res.add(construct(board));
        return;
        }
        for(int j=0;j<board.length;j++){
            if(validate (board,i,j)){
                board[i][j]='Q';
                dfs(board,res,i+1);
                board[i][j]='.';
            }
        }
    }
    public boolean validate(char[][]board, int row, int col){
      for(int i=0;i<row;i++){
          if(board[i][col]=='Q'){
              return false;}
      }  
          int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]=='Q') {
                return false;
            }
        }
        int maxRight = Math.min(row, board.length - 1 - col);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]=='Q') return false;
        }
        return true;
    
    }
      public List<String> construct(char[][] board) {//to add the list to the full list as string
    List<String> res = new LinkedList<String>();//build solution from temp chessboard
        for(int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);}
        return res; }

}