class Solution {
    public int findCenter(int[][] edges) {
        int n=0;
        Set<Integer> set=new HashSet<Integer>();
        for(int a[]:edges){
            if(!set.contains(a[0])){
                n++;
                set.add(a[0]);
            }
           if(!set.contains(a[1])){
                n++;
                set.add(a[1]);
            }
        }
        int count[]=new int[n+1];
        for(int d[]:edges)
        {
          count[d[0]]++;
            count[d[1]]++;
        }
        for(int i=1;i<=n;i++){
            if(count[i]==n-1)
                return i;
        }
        return -1;
    }
}