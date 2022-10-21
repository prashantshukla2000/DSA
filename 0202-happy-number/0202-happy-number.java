class Solution {
    public boolean isHappy(int n) {
        int sum=n,a=n;
    if (n == 1 || n == 7)
        return true;
        while(sum>9){
            sum=0;
        while(a>0){
        int rem=a%10;
        sum=sum+rem*rem;
            a=a/10;
        }
        
             if (sum == 1)
            return true;
                a=sum;
        }
       if (sum == 7)
        return true;
         
    return false;
    }
}