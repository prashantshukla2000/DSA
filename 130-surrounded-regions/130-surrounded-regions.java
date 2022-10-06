class Solution {
    public void solve(char[][] board) {
        for(int i=0;i<board.length;i++ ){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='O'&&(i==0||i==board.length-1||j==0||j==board[0].length-1))
                 dfs(board,i,j);
            }
        }
         for(int r=0;r<board.length;r++ ){
            for(int c=0;c<board[0].length;c++){
                
                    if(board[r][c]=='O'){
                        board[r][c]='X';
                    }
                }
            }
        
             for(int i=0;i<board.length;i++ ){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='T')
                    board[i][j]='O';
            }
        }
    }
    public void dfs(char[][]board,int r,int c){
        if(r<0||c<0||r==board.length||c==board[0].length||board[r][c]!='O')
            return;
        board[r][c]='T';
        dfs(board,r+1,c);
        dfs(board,r-1,c);
        dfs(board,r,c+1);
        dfs(board,r,c-1);
    }
        
}