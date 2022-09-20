class Solution {
    public int largestRectangleArea(int hist[]) 
    {
        // your code here
      int n=hist.length;
        int [] a=new int[n];
        int max=0;
        int []ps=prev(hist,n);
        int []ns=next(hist,n);
        for(int i=0;i<n;i++){
        int m=(int)(ns[i]-ps[i]-1)*hist[i];
        //System.out.println(ns[i]+" "+ps[i]);
        max=Math.max(m,max);
        }
        return max;
    }
        //for smallest prev element
   public static int[] prev(int a[],int n){
        Stack <Integer> s=new Stack<Integer>();
        int [] pele=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            while(!s.isEmpty()&&a[s.peek()]>=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                pele[i]=-1;
            }
            else{
                pele[i]=s.peek();
            }
            s.push(i);
        }
        return pele;
    }
  
        
        //for next smallest element
        public static int[] next(int[] arr,int n){

 int[] index = new int[n];
 Stack<Integer> stack = new Stack<>();

 for(int i=n-1;i>=0;i--){
  if(stack.isEmpty()){
  index[i] = n;
  }else if(arr[stack.peek()]>=arr[i]){
    while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
          stack.pop();
             }
            if(stack.isEmpty()){
            index[i] = n;
             }else{
             index[i] = stack.peek();
            }
  }else{
  index[i] = stack.peek();
  }
  stack.push(i);
 }
 return index;
}
}

