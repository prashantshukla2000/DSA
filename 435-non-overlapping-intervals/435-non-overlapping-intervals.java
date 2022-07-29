class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

   List<int []> res=new ArrayList<>();
        if(intervals.length==0||intervals==null)
            return 0;
         Arrays.sort(intervals, (a,b) -> a[0] -b[0]);//same work
      int count=0;
        int start=intervals[0][0];
        int end =Integer.MIN_VALUE;
        for(int i[] :intervals){
            if(i[0]>=end){
                 end=i[1];
            }else{
                count++;
                end=end>i[1]?i[1]:end;              
            }    
        }
       return  count;
    }

}