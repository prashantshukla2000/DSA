class Solution {
    public int maxProduct(int[] nums) {
    int max=Integer.MIN_VALUE,cmin=1,cmax=1;
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cmin=1;
                cmax=1;
                continue;
            }a=Math.min(nums[i]*cmax,cmin*nums[i]);
            b=Math.max(nums[i]*cmax,cmin*nums[i]);
            cmin=Math.min(a,nums[i]);
            cmax=Math.max(b,nums[i]);
            max=Math.max(cmax,max);
        }
        return max;
    }
}