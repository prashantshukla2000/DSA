class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,msum=-99999;
        for(int i=0;i<nums.length;i++){
            if(sum<0){
                sum=0;
            }
                sum=sum+nums[i];
            msum=Math.max(msum,sum);
        }
        return msum;
    }
}