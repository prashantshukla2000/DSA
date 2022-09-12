class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][]=new int[text1.length()+1][text2.length()+1];
        for(int i=0;i<=text1.length();i++){
            for(int j=0;j<=text2.length();j++){
               dp[i][j] =0;
            }
        }
        //We ahve set the column+1 and row+1 as zero so if it goes out of bound it will start returning and return the value                //at the beginning
         for(int i=text1.length()-1;i>=0;i--){
            for(int j=text2.length()-1;j>=0;j--){
               if((text1.charAt(i))==(text2.charAt(j))){
                   dp[i][j]=1+dp[i+1][j+1];//we add its diagonal and 1 as its value
               }else{
                  dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);//we set value=max of right or down of it 
               }
            }
        }
        return dp[0][0];
    }
}