class Solution {
    public List<List<String>> partition(String s) {
         List<List<String>> ans=new ArrayList<>();
        List<String> res=new ArrayList<>();
        dfs(ans,res,0,s);
        return ans;
    }
    public void dfs( List<List<String>> ans, List<String> res,int i,String s){
        if(i>=s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int j=i;j<s.length();j++){
            if(isPalindrome(s,i,j)){
                res.add(s.substring(i,j+1));
                dfs(ans,res,j+1,s);
                res.remove(res.size()-1);
            }
        }
    }
    public boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }
}