class Solution {
    public int uniquePaths(int m, int n) {
        int row[] = new int [n];//the bottom row
        for(int i=0;i<n;i++){row[i]=1;}//setting the last row for default all ele=1;
        for(int r=0;r<m-1;r++){
            int newrow[] = new int [n];//row above the old bottom row
             for(int i=0;i<n;i++){newrow[i]=1;} //setting new row each ele as one by default;
            for(int c=n-2;c>-1;c--){
                newrow[c] = row[c] + newrow[c+1];
            }
            row = newrow;//as we move up our new row becomes our bottom row. 
        }
        return row[0];
       
    }
}