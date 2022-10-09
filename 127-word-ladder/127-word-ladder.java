class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Map<String,List<String>> adjlist=new HashMap<>();
        wordList.add(beginWord);
        for(String word:wordList){
            StringBuilder string=null;
            for(int i=0;i<word.length();i++){
                string=new StringBuilder(word);
                string.setCharAt(i,'*');
                List<String> templist=adjlist.getOrDefault(string.toString(),new ArrayList<String>());
                templist.add(word);
                adjlist.put(string.toString(),templist);
            }
        }
        
        Queue<String> q=new LinkedList<>();
        Set<String> set=new HashSet<>();
        q.add(beginWord);
        set.add(beginWord);
        int step=1;
        StringBuilder string=null;
        while(!q.isEmpty()){
            step++;
            int size=q.size();
            for(int j=0;j<size;j++){
                String word=q.poll();
                for(int i=0;i<word.length();i++){
                   string=new StringBuilder(word);
                   string.setCharAt(i,'*'); 
                    for(String neigh:adjlist.get(string.toString())){
                        if(neigh.equals(endWord))
                            return step;
                        if(set.contains(neigh))
                            continue;
                        q.add(neigh);
                        set.add(neigh);
                    }
                }
            }
        }
       return 0; 
    }
}