class Solution {
    public int reverse(int x) {
     int c=0,rem=0;
        long sum=0;

        while(x!=0){
            rem=x%10;
            sum=sum*10+rem;
            if(sum > Integer.MAX_VALUE) return 0;
            if(sum < Integer.MIN_VALUE) return 0;
            x=x/10;
        }
        return (int)sum;
    }
}