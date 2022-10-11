class Solution {
    public int climbStairs(int n) {
     int st[]=new int[n+1];
        st[n]=1;
        st[n-1]=1;
        for(int i=n-2;i>=0;i--){
            st[i]=st[i+1]+st[i+2];
        }
        return st[0];
    }
}