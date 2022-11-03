class Solution {
    public int removeDuplicates(int[] nums) {
        //Two pointers soltion..
    int i=0;
        for(int j=1;j<nums.length;j++){
        if(nums[i]!=nums[j]){
            i++;
            nums[i]=nums[j];
        }
    }
        return i+1;
    }
}
//class Solution {
//     public int removeDuplicates(int[] nums) {
//Sliding Window solution...
//         int count=1,j=1;
//         for(int i=0;i<nums.length-1;i++){
//         while(j<nums.length && nums[j]==nums[i]){
//             j++;
//         }
//         while(j<nums.length && nums[j]!=nums[i]){
//            nums[count]=nums[j];
//             count++;
//             i=j;
//             j++;
//         }
//         }
//         return count;
        
//     }
// }