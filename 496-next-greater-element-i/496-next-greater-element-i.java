class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>(); 
        Stack<Integer> stack=new Stack<Integer>();
        for(int n:nums2){
            while(!stack.isEmpty() &&stack.peek()<n){
                hm.put(stack.pop(),n);
            }
                stack.push(n);
        }
        
        for(int i=0;i<nums1.length;i++){
           nums1[i]=hm.getOrDefault(nums1[i],-1);
        }
       
        return nums1;
        
    }
}