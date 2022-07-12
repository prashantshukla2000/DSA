class Solution {
    public void rotate(int[][] a) {
        for(int i=0;i<a.length;i++){
            int p=a.length-1;
            for(int  j=0;j<a.length/2;j++){
                int temp=a[i][j];
                a[i][j]=a[i][p];
                a[i][p]=temp;
                p--;
            }
        }
           for(int i=0;i<a.length;i++){
            for(int  j=0;j<a.length-i;j++){
                int n=a.length;
                int temp=a[i][j];
                a[i][j]=a[n-1-j][n-i-1];
                a[n-1-j][n-i-1]=temp;
            }
        }
    }
}