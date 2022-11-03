class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1,j=1;
        for(int i=0;i<nums.length-1;i++){
        while(j<nums.length && nums[j]==nums[i]){
            j++;
        }
        while(j<nums.length && nums[j]!=nums[i]){
           nums[count]=nums[j];
            count++;
            i=j;
            j++;
        }
        }
        return count;
        
    }
}