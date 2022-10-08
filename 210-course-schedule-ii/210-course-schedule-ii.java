class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int [] order=new int[numCourses];
  int[][]matrix=new int[numCourses][numCourses];
        int in[]=new int[numCourses];
        for(int i[]:prerequisites){
            int a=i[0];
            int b=i[1];
            in[a]++;
            matrix[b][a]=1;
        }
        Queue<Integer>q=new LinkedList<Integer>();
        for(int i=0;i<numCourses;i++){
            if(in[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
          int ele=q.poll();
            order[count]=ele;
            count++;
            int size=q.size();
            
            for(int i=0;i<numCourses;i++){
               if(matrix[ele][i]==1)
                if(--in[i]==0)
                {
                    q.add(i);
                }
            }
        }
        if(count==numCourses)
        return order;
        else
            return new int[0];
          
    }
}