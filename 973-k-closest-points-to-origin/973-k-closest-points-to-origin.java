class Solution {
    public int[][] kClosest(int[][] points, int k) {
   PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) ->
            Integer.compare(
              (b[0] * b[0] + b[1] * b[1]),(a[0] * a[0] + a[1] * a[1]))
        ); 
        for(int []i:points){
            queue.add(i);
         if (queue.size() > k) {
                queue.remove();
            }
        }
        int ans[][]=new int[k][2];
        for(int i=0;i<k;i++){
            int curr[]=queue.poll();
            ans[i][0]=curr[0];
            ans[i][1]=curr[1];
        }
        return ans;
    }
}