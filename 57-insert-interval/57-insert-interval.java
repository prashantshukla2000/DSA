class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans=new ArrayList<>();
        int start=newInterval[0];
        int end=newInterval[1];
        
        for(int[] i:intervals){
            if((start<=i[1]&&start>=i[0])||end>=i[0] &&end<=i[1]||start<=i[0]&&end>=i[1]){//if overlaps keep changing the start and end and we add them at the last
               start=Math.min(i[0],start);
               end=Math.max(i[1],end);
            }else{ // if it does not overlap simply add it
                ans.add(new int[]{i[0],i[1]});
            }
        }
                    ans.add(new int[]{start,end});
        int res[][]=ans.toArray(new int[0][]);
                   Arrays.sort(res,(a,b)->a[0]-b[0]);
       return res;
    }
}