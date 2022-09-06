class Solution {
    public int countSubstrings(String s) {  
        int start=0,end=0;int odd=0,Even=0;
        for(int i=0;i<s.length();i++){
           odd += lenOfPalidrome(s, i, i);//no .of all odd length palindrom strings possible
		  Even += lenOfPalidrome(s, i, i+1);//no .of all even length palindrom strings possible
    }
        		return odd+Even;

    }
    public int lenOfPalidrome(String s, int start, int end) {
int ans=0;
		while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
			start--;
			end++;
            ans++;
		}

		return ans;  
	}


}
