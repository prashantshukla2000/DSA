class Solution {
    List< List<Integer>> ans;
    int tar=0;
    int []can;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        can=candidates;
        tar=target;
       ans=new ArrayList<List<Integer>>();
        List<Integer> res=new ArrayList<Integer>();
        dfs(0,res,0);
        return ans;
    }
   public void dfs(int i,List<Integer> res,int total ){
        if(total==tar){
            ans.add(new ArrayList<>(res));
            return;
        }
        if(total>tar ||i>=can.length)
            return;
        res.add(can[i]);
        dfs(i,res,total+can[i]); //we include the element
        res.remove(res.size()-1);
        dfs(i+1,res,total);
    }
}