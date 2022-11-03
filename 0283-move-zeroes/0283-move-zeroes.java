// class Solution {
//     public void moveZeroes(int[] nums) {
//         int c=0,j=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]!=0){
//                 nums[j]=nums[i];
//                 j++;
//             }else{
//                 c++;
//             }
//         }
//         for(int i=nums.length-c;i<nums.length;i++){
//             nums[i]=0;
//         }
//     }
// }

//Snowball solution
class Solution {
     public void moveZeroes(int[] nums) {
        int snowBallSize = 0; 
        for (int i=0;i<nums.length;i++){
	        if (nums[i]==0){
                snowBallSize++; 
            }
          else if (snowBallSize > 0){//we swap the zero with the elements as we encounter them
	            int t = nums[i];
	            nums[i]=0;
	            nums[i-snowBallSize]=t;
            }
        }
    }
}