class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer,List<int[]>> map = new HashMap<>();  
        for (int[] edge: times) {
        map.putIfAbsent(edge[0], new ArrayList<>());
        map.get(edge[0]).add(new int[]{edge[1], edge[2]});
    }
                PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0] - b[0]));
                pq.add(new int[]{0, k});
        Set <Integer>visit=new HashSet<>();
        int t=0;
        while(!pq.isEmpty()){
            int [] c=pq.poll();
            int w=c[0];
            int n1=c[1];
            if(visit.contains(n1))
                continue;
            visit.add(n1);
            t=Math.max(t,w);
          if (!map.containsKey(n1)) continue;
            for(int[] next :map.get(n1)){
                int d=next[0];
                int we=next[1];
                if(!visit.contains(d)){
                    pq.add(new int[]{we+w, d});
                }
            }
        }
     if(visit.size()==n)
         return t;
        else
            return -1;
        
    }
}