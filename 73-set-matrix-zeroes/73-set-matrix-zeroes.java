class Solution {
    public void setZeroes(int[][] matrix) {
      int m=matrix[0].length  ,n=matrix.length;
        boolean r=false,c=false;
        for (int j=0;j<m;j++){
            if(matrix[0][j]==0){
                r=true;break;}
        }
            for (int i=0;i<n;i++){
            if(matrix[i][0]==0){
                c=true;break;}
        }
        for (int i=0;i<n;i++){
             for (int j=0;j<m;j++){
                if(matrix[i][j]==0){ 
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
             }
        }

        for (int i=1;i<n;i++){
             if(matrix[i][0]==0){
                 for(int j=1;j<m;j++){
                     matrix[i][j]=0;
                 }
             }
        }
        
             for (int j=1;j<m;j++){
             if(matrix[0][j]==0){
                 for(int i=1;i<n;i++){
                     matrix [i][j]=0;
                 }
             }
        }
        if(c==true){
            for(int i=1;i<n;i++){
                matrix[i][0]=0;
            }
        }
          if(r==true){
            for(int j=1;j<m;j++){
                matrix[0][j]=0;
            }
        }
    }

}