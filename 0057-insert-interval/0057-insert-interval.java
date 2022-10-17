class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> li=new ArrayList<>();
        int start=newInterval[0];
       int end= newInterval[1];
        for(int i[]:intervals){
            if((start>=i[0]&&start<=i[1])||end>=i[0]&&end<=i[1]||start<=i[0]&&end>=i[1]){
                start=Math.min(start,i[0]);
                end=Math.max(end,i[1]);
            }else{
                li.add(new int[]{i[0],i[1]});
            }
        }
        li.add(new int[]{start,end});
        int[][] ans=li.toArray(new int[0][]);
        Arrays.sort(ans,(a,b)->(a[0]-b[0]));
        return ans;
    }
}