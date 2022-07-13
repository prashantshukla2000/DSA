class Solution {
    public void setZeroes(int[][] mat) {
//       int m=matrix[0].length  ,n=matrix.length;
//         boolean r=false,c=false;
//         for (int j=0;j<m;j++){
//             if(matrix[0][j]==0){
//                 r=true;break;}
//         }
//             for (int i=0;i<n;i++){
//             if(matrix[i][0]==0){
//                 c=true;break;}
//         }
//         for (int i=0;i<n;i++){
//              for (int j=0;j<m;j++){
//                 if(matrix[i][j]==0){ 
//                     matrix[i][0]=0;
//                     matrix[0][j]=0;
//                 }
//              }
//         }
//         for (int i=0;i<n;i++){
//              if(matrix[i][0]==0){
//                  for(int j=1;j<m;j++){
//                      matrix[i][j]=9;
//                  }
//              }
//         }
        
//              for (int j=0;j<m;j++){
//              if(matrix[0][j]==0){
//                  for(int i=1;i<n;i++){
//                      matrix [i][j]=9;
//                  }
//              }
//         }
//         if(c==true){
//             for(int i=1;i<n;i++){
//                 matrix[i][0]=0;
//             }
//         }
//           if(r==true){
//             for(int j=1;j<m;j++){
//                 matrix[0][j]=0;
//             }
//         }
       // return matrix;

        boolean row_flag = false;
        boolean col_flag = false;
 
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == 0 && mat[i][j] == 0)
                    row_flag = true;
 
                if (j == 0 && mat[i][j] == 0)
                    col_flag = true;
 
                if (mat[i][j] == 0) {
 
                    mat[0][j] = 0;
                    mat[i][0] = 0;
                }
            }
        }
 
        for (int i = 1; i < mat.length; i++)
            for (int j = 1; j < mat[0].length; j++)
                if (mat[0][j] == 0 || mat[i][0] == 0)
                    mat[i][j] = 0;
 
        if (row_flag == true)
            for (int i = 0; i < mat[0].length; i++)
                mat[0][i] = 0;
 
        if (col_flag == true)
            for (int i = 0; i < mat.length; i++)
                mat[i][0] = 0;
    }
}