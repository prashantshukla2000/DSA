class Solution {
    public int rob(int[] nums) {
        int rob[]=new int[nums.length+1];
            rob[nums.length]=0;
        rob[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rob[i]=Math.max(rob[i+1],rob[i+2]+nums[i]);
        }
        return Math.max(rob[0],rob[1]);
    }
}