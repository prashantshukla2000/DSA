class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
       boolean dp[]=new boolean[s.length()+1];
        Arrays.fill(dp,false);
        dp[s.length()]=true;
        for(int i=s.length()-1;i>=0;i--){
            for(String j:wordDict){
                if(i+j.length()<=s.length()&& s.substring(i,i+j.length()).equals(j)){
                    dp[i]=dp[i+j.length()];
                }
                if(dp[i]==true)
                    break;
            }
        }
        return dp[0];
    }
}