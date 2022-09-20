class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer>stack=new Stack<Integer>();
        int ans[]=new int[temperatures.length];
        for(int i=0;i< temperatures.length;i++){
          while(!stack.isEmpty() && temperatures[i]> temperatures[stack.peek()]){
               int prevDay = stack.pop();
              ans[prevDay]=i-prevDay;
          }
              stack.push(i);
          }
        
        return ans;
    }
}