class Solution {

  public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;

        int row = matrix.length;
        int col = matrix[0].length;

        int top = 0;
        int bot = row-1;

        while(top<=bot) {
            int mid = (top+bot)/2;
           if(target>matrix[mid][col-1])
               top=mid+1;
            else if(target<matrix[mid][0])
                 bot=mid-1;
            else
                break;
        }
        if(top>bot)
            return false;
      int ourrow=(top+bot)/2;
      int l=0,r=col-1;
      while(l<=r){
          int colmid=(l+r)/2;
          
          if(target>matrix[ourrow][colmid])
              l=colmid+1;
          else if (target<matrix[ourrow][colmid])
              r=colmid-1;
          else
              return true;
      }
      return false;
  }

}