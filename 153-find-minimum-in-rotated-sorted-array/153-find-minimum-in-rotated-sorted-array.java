class Solution {
    public int findMin(int[] nums) {
        int l=0,r=nums.length-1;
        int res=nums[0];
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[l]<=nums[r])
            { res = Math.min(res,nums[l]);
            break;
            }
            res=Math.min(res,nums[mid]);
            if(nums[r]<nums[mid]){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return res;
    }
}