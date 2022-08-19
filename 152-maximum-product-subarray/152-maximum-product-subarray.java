class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE,currmin=1,currmax=1;int a=1,b=1;
        for(int i=0;i<nums.length;i++){
max=   Math.max(max,nums[i]);
        }
                for(int i=0;i<nums.length;i++){

            if(nums[i]==0){
                currmax=1;
                currmin=1;
                continue;
            }
                a=Math.max(nums[i]*currmax,nums[i]*currmin);
                    b=Math.min(nums[i]*currmax,nums[i]*currmin);
               currmax=Math.max(a,nums[i]);
               currmin=Math.min(b,nums[i]);
                max=Math.max(a,max);
            
        }
    
        return max;
    
    }
}
