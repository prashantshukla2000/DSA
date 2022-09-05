//we consider every node to be our palindromes center and see till where e can reach from thatto either side while maintaing palindrome property ie, its left =right
class Solution {
    public String longestPalindrome(String s) {
 if (s.length()==1 || s=="") 
     return s;       
        String res="";
        int start=0,end=0;
      int  reslength=0;
        for(int i=0;i<s.length();i++){
          int lenOdd = lenOfPalidrome(s, i, i);
			int lenEven = lenOfPalidrome(s, i, i+1);

			int maxCurrentLen = Math.max(lenOdd, lenEven);

			if(maxCurrentLen > end-start+1) {

				start = i - (maxCurrentLen-1) / 2;
				end = i + maxCurrentLen / 2;

			}
		}

		return s.substring(start, end+1);
    }
    public int lenOfPalidrome(String s, int start, int end) {

		while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
		}

		return end - start - 1;  
	}
}