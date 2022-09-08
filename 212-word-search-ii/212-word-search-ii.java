class TrieNode{
     HashMap<Character,TrieNode> children;
     boolean endOfWord=false;
   TrieNode(){
            children = new HashMap<Character, TrieNode>();
        }
    
      public void addWord(String word) {
     TrieNode curr=this;
        for(char c :word.toCharArray()){
            if(!curr.children.containsKey(c))
                curr.children.put(c ,new TrieNode());
            curr=curr.children.get(c);
        }
        curr.endOfWord=true;
    }

}

class Solution {
    int row,col;
     Set<String> res; 
     public List<String> findWords(char[][] board, String[] words) {
    TrieNode root=new TrieNode();
          for(String word : words){
            root.addWord(word);
        }
         res=new HashSet<String>();
         boolean[][] visit = new boolean[board.length][board[0].length];

        row=board.length;
        col=board[0].length;
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                     dfs(r,c,root,"",visit,board);
            }
        }
        List<String> output = new ArrayList<String>(res);
        return output;
    }
   public void dfs(int r, int c, TrieNode node,String word , boolean[][] visit,char[][] board){
        if(r<0||c<0||r==row||c==col||visit[r][c]||!node.children.containsKey(board[r][c]))
            return ;
       
       visit[r][c]=true;
        node = node.children.get(board[r][c]);
       word=word+board[r][c];
                if(node.endOfWord == true){
                 res.add(word);
        }
          dfs( r + 1 , c ,node,word, visit,board);
          dfs( r -1 , c ,node,word, visit,board);
          dfs( r , c+1 ,node,word, visit,board);
          dfs( r  , c-1 ,node,word, visit,board);
       
visit[r][c]=false;
   }
}
        