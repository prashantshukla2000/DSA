class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;
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