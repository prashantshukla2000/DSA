class TrieNode{
    HashMap <Character,TrieNode> children=new HashMap<>();
    boolean endOfWord=false;
}
class Trie {
 TrieNode root;
    public Trie() {
        root=new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode curr=root;
        for(char c:word.toCharArray() ){
            if(!curr.children.containsKey(c)){
           curr.children.put(c,new TrieNode());
            }
        curr=curr.children.get(c);
        }
        curr.endOfWord=true;
    }
    
    public boolean search(String word) {
      TrieNode  curr=root;
        for(char c :word.toCharArray() ){
            if(!curr.children.containsKey(c))
                return false;
            curr=curr.children.get(c);
        }
        return curr.endOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode curr=root;
       for(char c :prefix.toCharArray()){
           if(!curr.children.containsKey(c))
               return false;
           curr=curr.children.get(c);
       } 
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */