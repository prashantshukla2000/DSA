class Solution {
    public int missingNumber(int[] nums) {
        int ans=0,i=0;
       for(i=0;i<nums.length;i++){
           ans=ans^i^nums[i];
       } 
        return ans^i;
    }
}