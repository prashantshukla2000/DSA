class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);//as then only we can skip the duplicate cases
        dfs(nums,0,ans,res);
        return ans;
    }
   public void dfs(int [] nums,int i,List<List<Integer>> ans,List<Integer> res){
        if(i>=nums.length)
        {ans.add(new ArrayList<>(res));
            return;
    }else
        res.add(nums[i]);
        dfs(nums,i+1,ans,res);
        res.remove(res.size()-1);
       while(i+1<nums.length && nums[i]==nums[i+1]){i++;}
        dfs(nums,i+1,ans,res);
        
        }
    }
 
    
