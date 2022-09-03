public class Solution {
    // you need treat n as an unsigned value
    
    public int reverseBits(int n) {
        int p=0,a=0,res=0,bit=0;
   for(int i=0;i<32;i++){
    res = res << 1;
    bit = n&1;
    res += bit;
    n = n >>> 1;
   }
        return res;
    }
}