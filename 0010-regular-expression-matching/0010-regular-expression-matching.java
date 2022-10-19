class Solution {
    public boolean isMatch(String s, String p) {
       HashMap<String,Boolean> map=new HashMap<>();
       return dfs(0,0,s,p,map);
    }
    public boolean dfs(int i, int j,String s,String p, HashMap<String,Boolean> map){
        String key=i+"-"+j;
        if(map.containsKey(key))
        { return map.get(key);}
        if(i>=s.length()&&j>=p.length()) {return true;}
        //if both are completed then we found a way
        if(j>=p.length())  {return false;}//it means we have gone out of bound;
        
        boolean match =(i<s.length()) && (s.charAt(i)==p.charAt(j)||p.charAt(j)=='.');
        //check if first char matches
        if(j+1<p.length()&&p.charAt(j+1)=='*'){
          boolean value=(dfs(i,j+2,s,p,map)||(match && dfs(i+1,j,s,p,map)) ); //not includin the * 
            //including the *...j is same as the same character may be needed again
            map.put(key,value);
            return value;
        }
        if(match){//if the char matches but next char is not *
            boolean value=dfs(i+1,j+1,s,p,map);
            map.put(key,value);
            return value;
        }
        map.put(key,false);
        return false;
    
    }
}