class TrieNode{
    HashMap<Character,TrieNode> children=new HashMap<>();
    boolean endOfWord=false;
}
class WordDictionary {
 TrieNode root;
    public WordDictionary() {
               root=new TrieNode();  
    }
    
    public void addWord(String word) {
     TrieNode curr=root;
        for(char c :word.toCharArray()){
            if(!curr.children.containsKey(c))
                curr.children.put(c,new TrieNode());
            curr=curr.children.get(c);
        }
        curr.endOfWord=true;
    }
    public boolean dfs(int j,TrieNode node,String word){
            TrieNode curr=node;
            for(int i=j;i<word.length();i++){
            char c=word.charAt(i);
            if(c=='.'){
                      for(TrieNode child:curr.children.values()){
                        if( dfs(i+1,child,word))//as we are going dwn a child till it matches or come back and start with // new node from the children.values as any path can be followed if dot is encounterd
                                return true;
                      }
                                return false;
                         
            }else{
                if(!curr.children.containsKey(c))   //if one characterof word not present we say that word not present
                    return false;
                else
                    curr=curr.children.get(c); // else if it ...we move the trie to the next child of that charccter
                }
            }
        return curr.endOfWord;
        }
    
    
    public boolean search(String word) {
         return dfs(0,root,word);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */