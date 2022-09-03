public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    //   n=Integer.parseInt(n);
        int a=1,b=0;
        while(n!=0){
            b+=(n&1);
          n=(n)>>>1;
        }
        return b;
    }
}