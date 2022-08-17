class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
       PriorityQueue<int[]> queue=new PriorityQueue<>((a,b)->a[0]!=b[0]?b[0]-a[0]:b[1]-a[1]);
        int res[]=new int[k];
        for(int i=0;i<mat.length;i++){
            int soldiers=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)
                    soldiers++;
                 else
                     break;
                
            }
           queue.add(new int[]{soldiers,i});
        }
        while(queue.size()>k)
        {
            queue.poll();
        }
        while(k>0){
            res[--k]=queue.poll()[1];
        }
        return res;
    }
}