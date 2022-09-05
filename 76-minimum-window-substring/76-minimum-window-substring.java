class Solution {
    public String minWindow(String s, String t) {
        if(t.length()==0)
            return "";
        
              HashMap<Character,Integer> window=new HashMap<>();
              HashMap<Character,Integer> countT=new HashMap<>();
           for(int i=0;i<t.length();i++){
            countT.put(t.charAt(i),countT.getOrDefault(t.charAt(i),0)+1);
           }
        int have=0,need=countT.size();
        int reslength=Integer.MAX_VALUE;
        String res="";
        int l=0;
                   for(int r=0;r<s.length();r++){
                       char c=s.charAt(r);
                        window.put(c,window.getOrDefault(c,0)+1);
                       if(countT.containsKey(c)&& (int)window.get(c)==(int)countT.get(c)){
                           have=have+1;
                       }
                        while(have==need){
                           if(r-l+1<reslength){
                               res=s.substring(l,r+1);
                               reslength=r-l+1;
                           }   
                       window.put(s.charAt(l),window.get(s.charAt(l))-1);
                       if(countT.containsKey(s.charAt(l))&& window.get(s.charAt(l))<countT.get(s.charAt(l))){
                                  have=have-1;
                           }
                       l=l+1;
                    } 
              }
        //to trim after the 
        if(reslength!=Integer.MAX_VALUE){
             return res;          }
        else
            return "";

    }
}