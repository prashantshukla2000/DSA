class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE,currmax=1,currmin=1;
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                currmin=1;
                currmax=1;
                continue;
                
            }a=Math.max(currmax*nums[i],currmin*nums[i]);
            b=Math.min(currmax*nums[i],currmin*nums[i]);
            currmax=Math.max(a,nums[i]);
            currmin=Math.min(b,nums[i]);
            max=Math.max(max,currmax);
        }
    return max;
    }
}