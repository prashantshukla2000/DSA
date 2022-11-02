class Solution {
    public boolean isPalindrome(int x) {
     int save=x,res=0;
        if(x<0)
            return false;
        while(x!=0){
            int rem=x%10;
            res=res*10+rem;
            x=x/10;
        }
        if(res==save)
            return true;
        else 
            return false;
    }
}