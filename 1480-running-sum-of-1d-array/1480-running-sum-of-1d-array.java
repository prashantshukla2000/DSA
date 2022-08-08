class Solution {
    public int[] runningSum(int[] nums) {
    int sum=0;
        for(int i=0;i<nums.length;i++){
          sum=sum+nums[i];
    }int a=0;
    for(int i=nums.length-1;i>=0;i--){
        int temp=nums[i];
        nums[i]=sum-a;
        a=a+temp;
    }
    return nums;
    }
    
}