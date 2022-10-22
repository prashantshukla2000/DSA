public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int b=0;
            while(n!=0){
                b+=n&1;
                n=n>>>1;
            }
        return b;
    }
}