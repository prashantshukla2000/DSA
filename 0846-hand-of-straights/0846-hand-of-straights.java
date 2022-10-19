class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
            if(hand.length%groupSize  !=0)
        return false;
HashMap<Integer,Integer> hm=new HashMap();
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        for(int i:hand){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
 for(int n : hm.keySet()){
            queue.add(n);
        }       
        while(!queue.isEmpty()){
            int first=queue.peek();
        
        for(int i=first;i<first+groupSize;i++){
            if(!hm.containsKey(i)) return false;
            if(hm.get(i) == 0) return false;
            hm.put(i,hm.get(i)-1);
        }
             while(!(queue.isEmpty()) && (hm.get(queue.peek()) == 0)){
                queue.remove();
            }

        }
  return true;

    }
}