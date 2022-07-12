class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int a[]=new int[2];
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        int i=0;
        for( i=0;i<nums.length;i++){
            int x=target-nums[i];
            int j=i;
            if(hm.containsKey(x) &&(hm.get(x)!=i)){
             int y=hm.get(x);
              
                a[0]=Math.min(j,y);
                a[1]=Math.max(j,y);
                return a;
            }
            
        }
      a[0]=i;
        return a;
    }
}