class Solution {
    public int coinChange(int[] coins, int amount) {
     int[]dp=new int[amount+1] ;//since have to store 0...amt values
        for(int i=0;i<=amount;i++){
            dp[i]=Integer.MAX_VALUE;
        }
       // System.out.println(Integer.MAX_VALUE);
                dp[0]=0;
  for(int i=1;i<amount+1;i++){
 for(int c:coins){
   if(i-c>=0 && dp[i-c]!=Integer.MAX_VALUE){
     dp[i]=Math.min(dp[i],1+dp[i-c]);//dp[7]===1+dp[3]
 }
      }
    }
       
        if(dp[amount]>=amount+1){
                      return -1;}
    return dp[amount];

    }
}