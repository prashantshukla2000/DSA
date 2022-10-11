class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
     int st[]=new int[n+1];
        st[n]=0;
        st[n-1]=1;
        st[n-2]=2;
        for(int i=n-3;i>=0;i--){
            st[i]=st[i+1]+st[i+2];
        }
        return st[0];
    }
}