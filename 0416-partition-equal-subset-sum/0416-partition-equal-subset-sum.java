class Solution {
    public boolean canPartition(int[] nums) {
 Set<Integer> dp=new HashSet<Integer>();
        int sum=0;
        for(int a:nums)
            sum=sum+a;
        if(sum%2==1)return false;
        int target=sum/2;
        dp.add(0);
        for(int i=nums.length-1;i>=0;i--){
        List<Integer> list = new ArrayList<>(dp); 
            for(int t:list){
                if(t+nums[i]==target)
                    return true;
                dp.add(t+nums[i]);
            }
        }
        if(dp.contains(target)) return true;
      return false;
    }
}