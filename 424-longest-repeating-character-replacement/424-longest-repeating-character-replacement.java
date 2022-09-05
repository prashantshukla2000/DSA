class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,res=0,maxf=0;
        StringBuffer str=new StringBuffer();
      HashMap<Character,Integer> hm=new HashMap<>();
        for(int r=0;r<s.length();r++){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);
            maxf=Math.max(maxf,hm.get(s.charAt(r)));
              while((r-l+1)-maxf>k)
              {
               hm.put(s.charAt(l),hm.get(s.charAt(l))-1);
               l=l+1;
              }
            res=Math.max(res,r-l+1);

        }
        return res;

    }
}