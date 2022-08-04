class Solution {
    public boolean isPalindrome(int x) {
        String s="";
        s=s+x;
       StringBuilder sb=new StringBuilder(s) ;
        sb.reverse();
        if(s.equals(sb.toString()))
            return true;
        return false;
        
    }
}