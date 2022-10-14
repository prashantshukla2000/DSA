class Solution {
    public int uniquePaths(int m, int n) {
     int a[][]=new int[m][n];
     for(int i=0;i<m;i++){
         a[i][n-1]=1;
     }     for(int i=0;i<n;i++){
                 a[m-1][i]=1;
     }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                a[i][j]=a[i+1][j]+a[i][j+1];
            }
        }
        return a[0][0];
    }
}