class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    int []prices=new int[n];
        Arrays.fill(prices,Integer.MAX_VALUE);
        prices[src]=0;
        for(int i=0;i<k+1;i++){
             int[] temp = new int[n];
            temp = Arrays.copyOf(prices, prices.length);
            //we use temp so as to have only k stops inside the graph at a time
            for(int []data :flights)
            {
                int s=data[0];
                int d=data[1];
                int p=data[2];
                if(prices[s]==Integer.MAX_VALUE) //if we still haven't reahed the source node
                        continue;
                if(prices[s]+p<temp[d])
                {
                   temp[d]=prices[s]+p; 
                }
                
                }
        prices=temp;
        }
        if(prices[dst]==Integer.MAX_VALUE)
       return  -1;
        return prices[dst];
    }
}