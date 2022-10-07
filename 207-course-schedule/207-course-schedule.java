class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
     int matrix[][]=new int[numCourses][numCourses];
        int indegree[]=new int[numCourses];
        for(int i=0;i<prerequisites.length;i++){
            int a=prerequisites[i][0];
              int b=prerequisites[i][1];
           // if(matrix[b][a]==0){
                indegree[a]++;
                matrix[b][a]=1;
            //}
        }
        int count=0;
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int ele=queue.poll();
            count++;
            for(int i=0;i<numCourses;i++){
                if(matrix[ele][i]!=0){
                    if(--indegree[i]==0){
                        queue.add(i);
                    }
                }
            }
        }
        return count==numCourses;
    }
}
