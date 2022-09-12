class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> sol = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        dfs(sol, 0, list, candidates, target);
        return sol;
    }
    
    public void dfs(List<List<Integer>> sol ,int curr, List<Integer> list, int[] nums, int k){
        if(k<0)
            return;
        if(k==0){
            sol.add(new ArrayList<>(list));
            return;
        }
        for(int i=curr;i<nums.length;i++){
            list.add(nums[i]);
            dfs(sol, i, list, nums, k-nums[i]);
            list.remove(list.size()-1);
        }
    }
}