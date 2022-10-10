class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        Set<List<Integer>> visit=new HashSet<>();
            int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
          PriorityQueue<int[]> pq= new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        visit.add(Arrays.asList(0,0));
        pq.add(new int[]{grid[0][0],0,0});
          while(!pq.isEmpty())
          {
              int[] ele=pq.poll();
              int t=ele[0];
              int r=ele[1];
              int c=ele[2];
              if(r==n-1&&c==n-1)
                  return t;
              for(int dir[]:dirs){
                  int dr=dir[0];
                  int dc=dir[1];
                  int neighr=r+dr;
                  int neighc=c+dc;
                  if(neighr<0||neighc<0||neighr>=n||neighc>=n||visit.contains(Arrays.asList(neighr,neighc)))
                      continue;
                  visit.add(Arrays.asList(neighr,neighc));
                  pq.add(new int[]{Math.max(t,grid[neighr][neighc]),neighr,neighc});
                  
              }
          }
        return 0;
    }
}