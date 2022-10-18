class Solution {
    public int minDistance(String a, String b) {
        if(a.length()==0||b.length()==0)            
            return Math.max(a.length(),b.length());
            if(a.length()==0 && b.length()==0)
            return 0;
      HashMap<String,Integer> map=new HashMap<>();
      return  dfs(0,0,a,b,map);
    }
    public int dfs(int i,int j,String a,String b, HashMap<String,Integer> map){
         if(i==a.length()&&j==b.length()) return 0;    
    if ((i== a.length() && j != b.length())) return b.length() -j; 
	if ((i != a.length() && j == b.length())) return a.length() -i;
        String key=i+"-"+j;
        if(map.containsKey(key)) return map.get(key);
        if(a.charAt(i)==b.charAt(j)){
           int c=dfs(i+1,j+1,a,b,map);
            map.put(key,c);
            return c;
        }else{
            //deletion...we delete the character so we move i forward but j remains as still have o find that character at j in sting a...+1 as t took 1 operation to del it
           int delete = 1 + dfs(i+1, j,a,b,map);
            //insertion in it character is put so j is increased as matched but i still their
            int insert = 1 + dfs(i, j+1,a,b,map);
            //try replacing...then we put a new character so i is moved and now j matches so j is moved..1added as it took 1 move to replace it
            int replace = 1 +dfs(i+1, j+1,a,b,map);
            int c=Math.min(Math.min(delete,replace),insert);
            map.put(key,c); 
            return c;
            
        }
    }
}