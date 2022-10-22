public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
     int a=0,ans=0;
        for(int i=0;i<32;i++){
           a=n&1;
            ans=(ans<<1)+a;
            n=n>>>1;
       } 
        return ans;
    }
}