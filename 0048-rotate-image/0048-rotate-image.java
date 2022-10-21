class Solution {
    public void rotate(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
     for(int i=0;i<m;i++){
         int p=n-1;
         for(int j=0;j<n/2;j++){
             int temp=matrix[i][j];
             matrix[i][j]=matrix[i][p];
             matrix[i][p]=temp;
             p--;
         }
     }   
        for(int i=0;i<m;i++){
         for(int j=0;j<n-i;j++){
             int temp=matrix[i][j];
             matrix[i][j]=matrix[n-j-1][m-i-1];
           matrix[n-j-1][m-i-1]=temp;
         }
        }
    }
}