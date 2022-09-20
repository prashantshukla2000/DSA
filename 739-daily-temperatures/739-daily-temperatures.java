class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> stack=new Stack<Integer>();
        int ans[]=new int [t.length];
        for(int i=0;i<t.length;i++){
            while(!stack.isEmpty() &&t[i]>t[stack.peek()]){
                int prev=stack.pop();
                ans[prev]=i-prev;
            }
            stack.push(i);
        }
        return ans;
    }
}