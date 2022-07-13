class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum=1,nsum=1,p=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum*nums[i];
            if(nums[i]!=0)
            nsum=nsum*nums[i];
            if(nums[i]==0)
            p++;
        }
       for(int i=0;i<nums.length;i++)
       { if(p>1){
               nums[i]=0;
       }
        else if(nums[i]!=0)
            nums[i]=sum/nums[i];
         else
             nums[i]=nsum;
        }
        return nums;
    }
}