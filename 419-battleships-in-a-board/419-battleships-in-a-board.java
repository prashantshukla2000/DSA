class Solution {
    public int countBattleships(char[][] board) {
        int ans=0;
        int row=board.length,col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]=='X' &&(i==0 ||board[i-1][j]!='X' )&&(j==0 ||board[i][j-1]!='X' ))
                    ans=ans+1;
            }
        }
        return ans;
    }
}