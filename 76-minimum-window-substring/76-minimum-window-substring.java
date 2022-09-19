class Solution {
    public String minWindow(String s, String t) {
        if(t.length()==0)
            return "";
        HashMap<Character,Integer> window=new HashMap<>();
        HashMap<Character,Integer> ct=new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            ct.put(t.charAt(i),ct.getOrDefault(t.charAt(i),0)+1);
        }
        int have=0,need=ct.size(),reslength=Integer.MAX_VALUE;
        String res="";
        int l=0;
     for(int r=0;r<s.length();r++){
         window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);
          if(ct.containsKey(s.charAt(r)) &&(int)ct.get(s.charAt(r))==(int)window.get(s.charAt(r))){
              have=have+1;
          }
         while(have==need){
             if(r-l+1<reslength){
                 res=s.substring(l,r+1);
                 reslength=r-l+1;
             }
             window.put(s.charAt(l),window.get(s.charAt(l))-1);
             if(ct.containsKey(s.charAt(l))&&(int)ct.get(s.charAt(l))>(int)window.get(s.charAt(l))){
                 have=have-1;
             }
             l++;
         }
     }
        if(reslength!=Integer.MAX_VALUE)
            return res;
            else
                return "";
    }
}