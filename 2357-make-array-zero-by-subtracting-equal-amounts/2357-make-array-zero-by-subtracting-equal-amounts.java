class Solution {
    public int minimumOperations(int[] nums) {
     HashSet<Integer>hs=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                hs.add(nums[i]);
            }
        }
        return hs.size();
    }
}