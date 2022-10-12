class Solution {
    HashMap<Integer,Integer> map=new HashMap<>();
    int res=0;
    public int numDecodings(String s) {
 map.put(s.length(),1);
       return dfs(s,0);
    }
    public int dfs(String s,int i){
        int size=s.length();
        if(map.containsKey(i)){
            return map.get(i);}
    if(s.charAt(i)=='0'){
        return 0;}
        res=dfs(s,i+1);
        if((i+1<size)&& ((s.charAt(i)=='1')||(s.charAt(i)=='2' && Character.getNumericValue(s.charAt(i+1))<7))){
    res=res+dfs(s,i+2);}
        
    map.put(i,res);
    return res;
    }
}