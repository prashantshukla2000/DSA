class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int arr[]=new int[2];
        arr[0]=newInterval[0];
         arr[1]=newInterval[1];
        
       List<int []> res=new ArrayList<>();
        // if(intervals.length==0||intervals==null)
        //      return res.toArray(new int[0][]);
     
        for(int i[] :intervals){
      if(arr[0]<=i[1]&&arr[0]>=i[0]||(arr[1]>=i[0]&&arr[1]<=i[1])||arr[0]<=i[0]&&arr[1]>=i[1]){
             arr[0]=Math.min(arr[0],i[0]);
             arr[1]= Math.max(arr[1],i[1]); 
  
            }else{
                 res.add(new int[]{i[0],i[1]});      
            }    
        }
             res.add(new int[]{arr[0],arr[1]});
              int[][] anss=res.toArray(new int[0][]);
        
        Arrays.sort(anss,(a,b) -> a[0]-b[0]);
      return anss;  
    }
}