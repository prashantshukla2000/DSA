class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
    int count=0;
        for(int i=0;i<nums.length;i++)  
      {
                for(int j=0;j<nums.length;j++)  
                {
                          for(int k=0;k<nums.length;k++){
                              if(i!=j &&j!=k&& k!=i &&nums[k]-nums[j]==diff && nums[j]-nums[i]==diff)
                                  count++;
                          }  

                }
      }   
        return count;
    }
}