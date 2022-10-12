class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
   int max1= robber( Arrays.copyOfRange(nums,0, nums.length-1) );   
   int max2= robber( Arrays.copyOfRange(nums,1, nums.length) );   
   
    return Math.max(max1,max2);
    } 

     public int robber(int []nums){
       int rob[]=new int[nums.length+1];
            rob[nums.length]=0;
        rob[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rob[i]=Math.max(rob[i+1],rob[i+2]+nums[i]);
        }
        return Math.max(rob[0],rob[1]);  
    }

}