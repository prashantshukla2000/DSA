class Solution {
    public int countSubstrings(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(ispalindroe(s.substring(i,j))==true){
                   // System.out.print(s.substring(i,j));
                    res++;
                }
                    
            }
        }
    return res;
    }
    public boolean ispalindroe(String s){
        int l=0,r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}