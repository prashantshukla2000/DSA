class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> queue =new PriorityQueue<>();
        for(int a:nums){
            queue.add(a);
        }
        while(k>0){
            int n=queue.poll();
            n=n+1;
            queue.add(n);
            k--;
        }long mul=1;
        while(!queue.isEmpty()){
           
         mul=(mul*queue.poll())%1000000007;
        }
        return (int)mul;
    }
}