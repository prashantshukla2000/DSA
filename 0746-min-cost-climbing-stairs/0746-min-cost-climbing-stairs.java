class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int ans[]=new int[cost.length+1];
        ans[cost.length]=0;
        ans[cost.length-1]=cost[cost.length-1];
        
        for(int i=cost.length-2;i>=0;i--){
                    ans[i]=cost[i]+Math.min(ans[i+1],ans[i+2]);

        }
        return Math.min(ans[0],ans[1]);
    }
}