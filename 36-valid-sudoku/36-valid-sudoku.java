class Solution {
    public boolean isValidSudoku(char[][] board) {
         HashMap<Integer,HashSet<Character>> row=new HashMap<>();//for eah col no is key and 1-9 is the set.
         HashMap<Integer,HashSet<Character>> col=new HashMap<>();
         HashMap<List<Integer>,HashSet<Character>> sqr=new HashMap<>();//the key would be key/3,col/3 and hashset would be 1-9 set
        for(int i=0;i<9;i++){
            row.put(i, new HashSet<>());
            col.put(i, new HashSet<>());
            for(int j=0;j<9;j++){
			sqr.put(Arrays.asList(i/3,j/3), new HashSet<>());
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.')
                    continue;
    if( ! row.get(i).add(board[i][j])  ||!col.get(j).add(board[i][j])||!sqr.get(Arrays.asList(i/3,j/3)).add(board[i][j]) ){
                    return false;
                }
                   
            }
        }
 return true;
    }
}


   