class Solution {
    public boolean containsDuplicate(int[] nums) {
     Set<Integer>s=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        return !(s.size()==nums.length);
    }
}