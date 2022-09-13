class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
   int max1= houserobber1( Arrays.copyOfRange(nums,0, nums.length-1) );   
   int max2= houserobber1( Arrays.copyOfRange(nums,1, nums.length) );   
   
    return Math.max(max1,max2);
    }
       public int houserobber1(int[] arr) {
    int rob1=0,rob2=0;
    for(int i=0;i<arr.length;i++){
        int temp=Math.max(rob1+arr[i],rob2);
        rob1=rob2;
        rob2=temp;
    }
    return rob2;
       }
}