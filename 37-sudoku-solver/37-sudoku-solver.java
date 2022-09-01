class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                   for(char c='1';c<='9';c++){
                       if(isValid(board,i,j,c)){
                           board[i][j]=c;
                       
                       if(solve(board)==true)
                           return true;
                       else
                           board[i][j]='.'; //if the position not found valid for char we make empty and look at next c
                   }
                }
                return false; // if none have been fund from 1-9 for the space means that sol. is wrong
            }
            }
        }
        return true; // if we dont find any empty means all filled means sol found whch need to be returned.
    }
    public boolean isValid(char[][] board, int row, int col,char c){
       for(int i=0;i<9;i++) {
           if(board[row][i]==c)
               return false;
             if(board[i][col]==c)
               return false;
           if (board[3*(row/3)+i/3][3*(col/3)+i%3]==c)
               return false;
       }
        return true;
    }
}