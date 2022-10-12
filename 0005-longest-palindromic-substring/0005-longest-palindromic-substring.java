class Solution {
    int low=0,maxlen=0;
    public String longestPalindrome(String st) {
        int a=0,sa=0,e=0;
      for(int i=0;i<st.length();i++){
         check(i,i,st);
          check(i,i+1,st);
      }  
    return st.substring(low,low+maxlen);
    }
    public void check(int sa, int e, String s){
        while(sa >= 0 && e < s.length()&&s.charAt(sa)==s.charAt(e)){
            sa--;
            e++;
        }
        if(maxlen<e-sa-1){
            low=sa+1;
            maxlen=e-sa-1;
        }
    }
}