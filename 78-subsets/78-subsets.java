class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        dfs(nums,0,ans,res);
        return ans;
    }
   public void dfs(int [] nums,int i,List<List<Integer>> ans,List<Integer> res){
        if(i>=nums.length)
        {ans.add(new ArrayList<>(res));
            return;
    }
        res.add(nums[i]);
        dfs(nums,i+1,ans,res);
        res.remove(res.size()-1);
        dfs(nums,i+1,ans,res);
    }
}