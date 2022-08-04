class Solution {
    public int countElements(int[] nums) {
     int max = Arrays.stream(nums).max().getAsInt();
    int min=Arrays.stream(nums).min().getAsInt();
      int c=0;
        for(int i:nums){
            if(i>min&&i<max)
                c++;
        }
        return c;
    }
}