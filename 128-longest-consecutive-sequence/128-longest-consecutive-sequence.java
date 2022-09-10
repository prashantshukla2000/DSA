//if any no doesn't have a left neighbour like for 2 left neighbour is 2-1=1 then it is said to start of the sequence in ex={100,4,1,2,200,3} ,...start of sequence are 1,100,200 since they ahve no left no. ..for these we check which of then can form a ongest sequence by adding 1 and checking in set ,others that are not sequence starter we skip them as they would be the right neighbour of any one of the start elementss
class Solution {
    public int longestConsecutive(int[] nums) {
      Set<Integer> set=new HashSet<Integer>();
        int longest=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i :nums){
            if(!set.contains(i-1)){
                int count=0,a=0;
                while(set.contains(i+a)){
                    count=count+1;
                    a=a+1;
                    longest=Math.max(count,longest);
                }
            }
        }
        return longest;
    }
}