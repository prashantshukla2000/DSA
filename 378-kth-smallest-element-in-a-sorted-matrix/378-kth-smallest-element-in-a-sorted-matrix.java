class Solution {
    public int kthSmallest(int[][] matrix, int k) {
PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                queue.add(matrix[i][j]);
                if(queue.size()>k)
                    queue.poll();
            }
        }
     return queue.poll();
    }
}