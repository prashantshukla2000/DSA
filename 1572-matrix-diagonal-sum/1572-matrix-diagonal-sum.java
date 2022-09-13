class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length,l=0,r=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    l+=mat[i][j];}
                else if( i+j==n-1)
                    r=r+mat[i][j];
            }
        }
        return l+r;
    }
}