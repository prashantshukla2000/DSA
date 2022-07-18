class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        int[] index = new int[prices.length];
 Stack<Integer> stack = new Stack<>();

 for(int i=n-1;i>=0;i--){
  if(stack.isEmpty()){
  index[i] = 0;
  }else if(prices[stack.peek()]>=prices[i]){
    while(!stack.isEmpty() && prices[stack.peek()]>prices[i]){
          stack.pop();
             }
            if(stack.isEmpty()){
            index[i] = 0;
             }else{
             index[i] = prices[stack.peek()];
            }
  }else{
  index[i] = prices[stack.peek()];
  }
  stack.push(i);
 }
        for(int i=0;i<n;i++){
            index[i]=prices[i]-index[i];
        }
 return index;
        
    }
}