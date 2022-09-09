class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
         PriorityQueue<Integer> queue =new PriorityQueue<Integer>
((a,b)-> hm.get(b)-hm.get(a));
        for(int key:hm.keySet()){
            queue.add(key);
        }
                        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=queue.poll();
        }
        return res;
    }
 }

