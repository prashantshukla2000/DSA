class Solution {
    public int leastInterval(char[] tasks, int n) {
     HashMap<Character,Integer> map=new HashMap();
        for(char c:tasks){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> queue=new PriorityQueue<>((a,b)-> a.getValue()!=b.getValue()?b.getValue()-a.getValue():a.getKey()-b.getKey());
        queue.addAll(map.entrySet());
        
        int count=0;
        while(!queue.isEmpty()){
        int k=n+1;
       List<Map.Entry> tempList = new ArrayList<>();
            while(k>0 && !queue.isEmpty() )
            {
                Map.Entry<Character,Integer> top=queue.poll();
                top.setValue(top.getValue()-1);
                tempList.add(top);
                k--;
               count++; 
            }
      for(Map.Entry<Character, Integer> e : tempList) // add valid tasks
        {
            if(e.getValue()>0)
                queue.add(e);
        }
           if(queue.isEmpty()) break;
            
            count=count+k;
        }
        return count;
    }
}