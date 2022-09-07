class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];
        int count=0;
       for(int i[]:intervals) {
        if(i[0]>=end){
            end=i[1];
        }else{
            count++;
            end=Math.min(end,i[1]);
        } 
           
       }
        return count-1;
    }
}