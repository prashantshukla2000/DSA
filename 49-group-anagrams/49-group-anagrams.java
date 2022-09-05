class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     HashMap<String,List<String>>hm=new HashMap();

     for(int i=0;i<strs.length;i++){
          String s=strs[i];
         char[] count = new char[26];
        
         for(char c:s.toCharArray()){
             count[(c)-('a')]+=1;
         }
          String key = String.valueOf(count);
         if(hm.containsKey(key))
             hm.get(key).add(s);
         else{
             hm.put(key,new ArrayList<>());
                 hm.get(key).add(s);
         }
        
     }  
         return new ArrayList<>(hm.values());
    }
}