class Solution {int n[];
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        n=nums;
        dfs(ans,res);
            
        return ans;
    }
                public void dfs(List<List<Integer>>ans,List<Integer>res){
                    if(res.size()==n.length)
                    {
                        ans.add((new ArrayList<>(res)));
                        return;
                    }else{
                        for(int i=0;i<n.length;i++){
                            if(res.contains(n[i]))
                                continue;
                            res.add(n[i]);
                            dfs(ans,res);
                            res.remove(res.size()-1);
                        }
                    }
                }
}