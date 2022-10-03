class Solution {
    int []n;
    int t;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Arrays.sort(candidates);
        n=candidates;t=target;
           dfs(ans,res,0,0);
        return ans;
    }
    public void dfs(List<List<Integer>> ans ,List<Integer> res,int i,int total){
        if(total==t){
            ans.add(new ArrayList<>(res));
            return;
        }  if(i>=n.length||total>t)
            return;

        res.add(n[i]);
        dfs(ans,res,i+1,total+n[i]);
        res.remove(res.size()-1);
        while(i+1<n.length &&n[i]==n[i+1]){i++;}
        dfs(ans,res,i+1,total);
    }
}