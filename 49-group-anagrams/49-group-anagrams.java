class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>hm=new HashMap();
     for(int i=0;i<strs.length;i++){
         String s=strs[i];
         char[] arr=s.toCharArray();
         Arrays.sort(arr);
         String st=new String(arr);
         if(hm.containsKey(st))
             hm.get(st).add(s);
         else{
             hm.put(st,new ArrayList<>());
                 hm.get(st).add(s);
         }
        
     }  
         return new ArrayList<>(hm.values());
    }
}