class Solution {
    public String longestPalindrome(String s) {
        String se="";
        int a=0,sa=0,e=0;
      for(int i=0;i<s.length();i++){
         int odd=check(i,i,s);
          int even=check(i,i+1,s);
          int ma=Math.max(even,odd);
          if(ma>a){
              sa=i-(ma-1)/2;
              e=i+ma/2;
              a=ma;
          }
      }  
    return s.substring(sa,e+1);
    }
    public int check(int sa, int e, String s){
        while(sa >= 0 && e < s.length()&&s.charAt(sa)==s.charAt(e)){
            sa--;
            e++;
        }
        return e-sa-1;
    }
}