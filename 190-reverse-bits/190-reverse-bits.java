public class Solution {
    // you need treat n as an unsigned value
    
    public int reverseBits(int n) {
        int p=0,a=0,res=0;
   for(int i=0;i<32;i++){
      a=n&1;
      p=(p<<1)|a;
      n=(n)>>>1; 

   }
        return p;
    }
}