class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
     boolean rowc=false,colc=false;
        for(int j=0;j<m;j++){
            if(matrix[0][j]==0){
                rowc=true;
                break;
        }
        }
              for(int i=0;i<n;i++){
            if(matrix[i][0]==0){
                colc=true;
                break;
        }
              }
         for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(matrix[i][j]==0){
                   matrix[i][0]=0;
                     matrix[0][j]=0;
                    }
                        }
                   }
         for(int i=1;i<n;i++){
           if(matrix[i][0]==0){
               for(int j=1;j<m;j++){
                   matrix[i][j]=0;
               }
           }                  
        }
         for(int j=1;j<m;j++){
           if(matrix[0][j]==0){
               for(int i=1;i<n;i++){
                   matrix[i][j]=0;
               }
           }                  
        }
         if(rowc==true){
             for(int j=0;j<m;j++){
                 matrix[0][j]=0;
         }     
         }
        if(colc==true){
             for(int i=0;i<n;i++){
          matrix[i][0]=0;}
        }
        
    }
}