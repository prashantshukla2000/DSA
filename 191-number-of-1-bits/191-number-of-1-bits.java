public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    //   n=Integer.parseInt(n);
        int b=0;
        while(n!=0){
            n=n&(n-1);
          b=b+1;
        }
        return b;
    }
}