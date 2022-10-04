class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        Map<Character,String> map=Map.of('2',"abc",'3',"def",'4',"ghi",'5',"jkl",'6',"mno",'7',"pqrs",'8',"tuv",'9',"wxyz");
         if (digits.length() == 0) {
            return new ArrayList();
        }
        dfs(map,digits,res,0,"");
        return res;
    }
  public void  dfs(Map<Character,String> map, String digits,List<String> res,int i,String curString){
        if(curString.length()==digits.length()){
            res.add((curString));
            return;
        }
        for(char c:map.get(digits.charAt(i)).toCharArray()){
            dfs(map,digits,res,i+1,curString+c);
        }
    }
}