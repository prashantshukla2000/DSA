class Solution {
    HashMap<Integer,Integer> dp=new HashMap<>(); //index of character ,the ways it can be decoded
    int res;
    public int numDecodings(String s) {
         int size = s.length();
        dp.put(size, 1); //if we get an empty string w want to reurn 1
        for(int i=s.length()-1;i>-1;i--){
        if (s.charAt(i) == '0') {
            dp.put(i, 0);
        }else{
        dp.put(i,dp.get(i+1)) ;
        }
            if ((i + 1 < size) && ((s.charAt(i) == '1') 
            || (s.charAt(i) == '2') && (Character.getNumericValue(s.charAt(i + 1)) < 7))
            ) {
       int ans= dp.get(i)+dp.get(i+2) ;
                dp.put(i,ans);
        }
        }

        return dp.get(0); 
    }
}