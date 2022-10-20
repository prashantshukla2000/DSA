class Solution {
    public int[] minInterval(int[][] intervals, int[] queries) {
         int i = 0, n = intervals.length, m = queries.length;
        int[] Q = queries.clone();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0] , b[0]));
        HashMap<Integer,Integer>hm=new HashMap<>();
        Arrays.sort(Q);
          PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->(a[0] - b[0]));
        for(int q:Q){
            while(i<n&& intervals[i][0]<=q){
             int left=intervals[i][0],right=intervals[i][1];
             pq.add(new int[] {right-left+1,right});
                i++;
            }
             while (!pq.isEmpty() && pq.peek()[1] < q){ 
                 pq.poll();
             }
          if(!pq.isEmpty()){
                hm.put(q, pq.peek()[0]);
            } else{
                 hm.put(q, -1);
            }

        }
int result[]=new int[m];
    for(int j = 0; j<m; j++) {
            if(hm.containsKey(queries[j])){
                result[j] = hm.get(queries[j]);
            } else {
                result[j] = -1;
            }
        }
        return result;
    }
}