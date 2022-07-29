class Solution {
    public int[] buildArray(int[] nums) {
        int i=0; 
int a[]=new int[nums.length];
while(i<nums.length){
    a[i]=nums[nums[i]];
    i++;
}
return a;

        
    }
}