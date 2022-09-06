class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     int n=matrix.length;
        int m=matrix[0].length;
        int left=0,right=m,top=0,bottom=n;
        List<Integer> t=new ArrayList<Integer>();
        while(top<bottom&&left<right){
            for(int i=left;i<right;i++){
             t.add(matrix[top][i]);
            }
            top=top+1;
            for(int i=top;i<bottom;i++){
          t.add(matrix[i][right-1]);

            }
            right=right-1;
            if(!((top<bottom&&left<right)))  //in cae we have single row or col only.
               break;
               
            for(int i=right-1;i>=left;i--){
             t.add(matrix[bottom-1][i]);
            }
               bottom=bottom-1;
          
              for(int i=bottom-1;i>=top;i--){
          t.add(matrix[i][left]);

            }
            left=left+1;
        }
               return t;
    }
}