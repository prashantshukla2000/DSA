class Solution {
    public int numDistinct(String s, String t) {
     HashMap<String,Integer> map=new HashMap<>();   
     return dfs(0,0,s,t,map);
    }
   public int dfs(int i, int j ,String s,String t,HashMap<String,Integer> map){
        if(j==t.length())
            return 1;
        if(i==s.length())
            return 0;

        String key=i+"-"+j;
        if(map.containsKey(key))
            return map.get(key);
       int c;
        if(s.charAt(i)==t.charAt(j)){
     c=  dfs(i+1,j+1,s,t,map)+dfs(i+1,j,s,t,map);
            //if same move 
        }else{
         c=dfs(i+1,j,s,t,map);//if character doesnt match check with next one
        }
        map.put(key,c);
        return c;
    }
}