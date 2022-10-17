class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i[]:intervals){
            if(i[0]<=end){
                end=Math.max(i[1],end);
            }else{
                ans.add(new int[]{start,end});
                start=i[0];
                end=i[1];
            }
        }
                ans.add(new int[]{start,end});
        
        int [][]res=ans.toArray(new int[0][]);
        return res;
    }
}