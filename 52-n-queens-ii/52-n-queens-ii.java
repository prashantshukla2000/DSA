class Solution {
    public int totalNQueens(int n) {
        int board[]=new int [n];
        for(int i=0;i<n;i++){
            board[i]=-1;
        }
        int curr=0;
        int count=0;
        while(curr!=-1){
            boolean placefound=false;
            for(int i=board[curr]+1;i<n;i++){
               
                placefound=isvalidpos(board,curr,i);
                if (placefound==true)
                {
                  board[curr]=i;
                    curr=curr+1;
                    break;
                }
            }
            
            if(curr==n){
                count++;
                board[n-1]=-1;
                curr=n-2;
            }
            if(placefound==false){
                board[curr]=-1;
                curr=curr-1;
            }
            
        }
        return count;
    }
    public static boolean isvalidpos(int[] board,int curr,int i)
    {
        for(int k=0;k<curr;k++){
            if(curr-k==Math.abs(i-board[k])||i==board[k]){
                return false;
            }
        }
        return true;
    }
}