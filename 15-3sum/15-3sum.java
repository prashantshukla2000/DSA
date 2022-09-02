class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        
                for(int i=0;i<nums.length;i++){
                if(i>0 && nums[i]==nums[i-1])
                continue;
                    else{
                    int j=i+1,k=nums.length-1;
                while(j<k){
                    if(nums[i]+nums[j]+nums[k]==0 && i!=j&& j!=k && k!=i)
                    {
                        List<Integer> li=new ArrayList<Integer>();
                        li.add(nums[i]);li.add(nums[j]);li.add(nums[k]);
                        ans.add(li);
                        j++;
                         while(j<k && nums[j]==nums[j-1])
                        {
                            j++;
                        }
                    }else{
                        if(nums[i]+nums[j]+nums[k]>0 ){
                            k--;
                        }else{
                            j++;
                        }
                    }
                }
                    }
                }        
            return ans;
    }
}