class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1,p=0;
        int max=0;
        while(r<prices.length){
            p=(prices[r]-prices[l]);
          max=Math.max(max,p);
            
           if(p<0){
               l=r;
           }
                r++;
        }
                       return max;
    }
}