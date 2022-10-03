class Solution {
    int c[];
    int t;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        c=candidates;
        t=target;
        List<List<Integer>> ans=new ArrayList<>();
        List <Integer> res=new ArrayList<>();
        dfs(ans,res,0,0);
        return ans;
    }
    public void dfs(List<List<Integer>> ans,List<Integer> res, int i,int total){
        if(total==t){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(i>=c.length||total>t)
            return;
        res.add(c[i]);
        dfs(ans,res,i,total+c[i]);
        res.remove(res.size()-1);
        dfs(ans,res,i+1,total);
    }
}