class Solution {
    public int lengthOfLIS(int[] nums) {
        int lis[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            lis[i]=1;
        
        for(int i=nums.length-1;i>-1;i--){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    lis[i]=Math.max(lis[i],1+lis[j]);
                }
            }
            }
        int max=0;
        for(int i=0;i<lis.length;i++){
           max= Math.max(max,lis[i]);
        }
        return max;
    }
}