class Solution {
    public int findTargetSumWays(int[] nums, int target) {
      Map<String, Integer> cache = new HashMap<>();//index+total==no.of ways
        return dfs(nums,target,cache,0,0);
     
    }
       public int dfs(  int[] nums,int target, Map<String, Integer> cache, int index, int total ) {
        if (index==nums.length) {
            if(target==total)
                return 1;
            else
                return 0;
        }
        String key = index + "-" + total; 

        if (cache.containsKey(key)) {
            return cache.get(key);
        }
          int n=dfs(nums,target,cache,index+1,total+nums[index])+  dfs(nums,target,cache, index+1,total-nums[index]);//either it is added or sub ,it moves oe step forward
   cache.put(key,n);
           return n;
}
}