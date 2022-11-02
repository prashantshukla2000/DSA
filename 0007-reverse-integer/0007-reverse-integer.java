class Solution {
    public int reverse(int x) {
      int res=0;
        while(x!=0){
           int d=x%10;
            x=x/10;
            
            if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE && d>=Integer.MAX_VALUE%10)){
                return 0;
            }
             if(res<Integer.MIN_VALUE/10||(res==Integer.MIN_VALUE && d<=Integer.MIN_VALUE%10)){
                return 0;
            }
            res=res*10+d;
            
        }
        return res;
      
    }
}