class Solution {
    public int jump(int[] nums) {
        int res=0;
        int l=0,r=0;//intially we have only the frst elemeent in our indow
        while(r<nums.length-1){
            int farthest=0;//finding what is the max distance we can jump
            for(int i=l;i<=r;i++){
               farthest= Math.max(farthest,i+nums[i]);
            }
            l=r+1;
            r=farthest;
            res++;
        }
        return res;
    }
}