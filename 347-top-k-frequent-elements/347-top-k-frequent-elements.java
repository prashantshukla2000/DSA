class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        //maxheap
        PriorityQueue<Integer> queue =new PriorityQueue<Integer>((a,b)->
            hm.get(b)-hm.get(a));
        for(int key:hm.keySet()){
            queue.add(key);
        }
       // System.out.print(hm);
        int result[]=new int[k];
        for(int i=0;i<k;i++)
        {
            result[i]=queue.poll();
        }
        return result;
    }
}