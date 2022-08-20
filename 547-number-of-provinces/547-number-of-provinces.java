class Solution {
    public int findCircleNum(int[][] isConnected) {
     Set<Integer> set=new HashSet<Integer>();
       int n=isConnected.length;
       int count=0;
        for(int i=0;i<n;i++){
            if(set.contains(i)){
              continue;}
            count++;
            set.add(i);
            Queue<Integer> queue=new LinkedList<Integer>();
            queue.add(i);
            while(!queue.isEmpty()){
                int ele=queue.remove();
                for(int adji=0;adji<n;adji++){
                    if((isConnected[ele][adji]==1 )&& (!(set.contains(adji))))
                    {
                        set.add(adji);
                        queue.add(adji);
                    }
                }
            }
            }
        return count;
    }
}