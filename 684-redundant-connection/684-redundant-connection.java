class Solution {
    public int[] findRedundantConnection(int[][] edges) {
       int pr[]=new int[1001];
       for(int i=0;i<1001;i++){
           pr[i]=i;
       } 
        for(int edge[]:edges){
            int a=edge[0];
            int b=edge[1];
            int par_a=a;
            int par_b=b;
            while(par_a!=pr[par_a]){
                par_a=pr[par_a];
            }
             while(par_b!=pr[par_b]){
                par_b=pr[par_b];
            }
            if(par_a==par_b)
                return edge;
            else
                pr[par_a]=par_b;
        }
        return new int[2];
        
    }
}