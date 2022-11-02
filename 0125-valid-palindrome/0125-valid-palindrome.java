
class Solution {
    public boolean isPalindrome(String s) {
        String stripped = s.toLowerCase().replaceAll("[^a-z\\d]", "");
        if(stripped.length()==0||stripped.length()==1)
            return true;
        return isPalindromeR(stripped,0,stripped.length()-1);
    }
    
    public boolean isPalindromeR(String str,int s, int e) {
        if(s>=e)
            return true;
        if (str.charAt(s)!=str.charAt(e)) return false;
        return isPalindromeR(str,s+1,e-1);
    }

    
}