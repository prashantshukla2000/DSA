class Solution {
    public int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
           int mid=(l+r)/2;
            if(nums[mid]==target)
                return mid;
            //are we in left sorted portion of array
            if(nums[l]<=nums[mid]){
              if(target>nums[mid]){
                  l=mid+1;
              }else if(target<nums[l]) // means mid is also part of left sorted array so ele must be in right side if smaller than l
                  l=mid+1;
                else         // if target less than mid but> than l means in the left side only present. 
                    r=mid-1;
                
                
            }
            else{
                 if(target<nums[mid]){// then ele is present on the left side of the middle
                     r=mid-1;
                 }else if(target>nums[r])
                  r=mid-1;
                else 
                    l=mid+1;
            }
                
        }
               
        
        return -1;
    }
}