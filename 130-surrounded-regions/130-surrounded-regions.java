class Solution {
    int row=0;
    int col=0;
    public void solve(char[][] board) {
        row=board.length;
        col=board[0].length;
        //converting the outer "0" to temporary ->"T"
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
              if(board[i][j]=='O' &&((i==0 ||i==row-1)||(j==0 ||j==col-1)))
                board= capture(i,j,board);
            }
        }
                 
             //    converting the rest of inside "0" to "X"
                  for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 if(board[i][j]=='O' )
                     board[i][j]='X';
            }
                 }
                 //converting all the "T" back into "0" 
                      for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 if(board[i][j]=='T' )
                     board[i][j]='O';
            }
                  }
        
    }
                 //using dfs
    public  char[][] capture(int r,int c, char[][]board){
        if(!(r<0 ||c<0 ||r>row-1||c>col-1||board[r][c]!='O'))
        {
        board[r][c]='T';
        capture(r+1,c,board);
        capture(r-1,c,board);
        capture(r,c+1,board);
        capture(r,c-1,board);
        }
        return board;
    }
}