class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li =new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            else{
                int l=i+1,r=nums.length-1;
                while(l<r){
                    int threesum=nums[l]+nums[r]+nums[i];
                    if(threesum<0)
                        l++;
                    else if(threesum>0)
                        r--;
                    else 
                    {       List<Integer> al =new ArrayList<>();
                               al.add(nums[i]);
                                al.add(nums[l]);
                               al.add(nums[r]);
                     li.add(al);

                        l++;
                        while(l<r && nums[l]==nums[l-1])
                        {
                            l++;
                        }
                    }
                }
            }
        }
        return li;
    }
}