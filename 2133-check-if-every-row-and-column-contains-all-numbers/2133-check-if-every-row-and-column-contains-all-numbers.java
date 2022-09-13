class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
       HashMap<Integer,HashSet<Integer>> row=new HashMap<>();
       HashMap<Integer,HashSet<Integer>> col=new HashMap<>();
        for(int i=0;i<n;i++){
           row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
        } 
        
      for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
              if(matrix[i][j]>n||!row.get(i).add(matrix[i][j])||!col.get(j).add(matrix[i][j])){
                  return false;}
          }
      }  
        return true;
    }
}