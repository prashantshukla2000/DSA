class Solution {
    public int[] twoSum(int[] num, int target) {
       int[] ans=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<num.length;i++){
            hm.put(num[i],i);
        }
        for(int i=0;i<num.length;i++){
            if(hm.containsKey(target-num[i]) && hm.get(target-num[i])!=i){
               
                ans[0]=i;
                ans[1]=hm.get(target-num[i]);
                break;
                
            }
        }
        return ans;
    }
}