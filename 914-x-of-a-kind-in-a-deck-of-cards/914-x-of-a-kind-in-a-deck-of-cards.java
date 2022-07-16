class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int c=0,d=Integer.MAX_VALUE;
        for(int i=0;i<deck.length;i++){
            hm.put(deck[i],(hm.getOrDefault(deck[i],0)+1));
        }
        int a=0;
                for (Map.Entry<Integer, Integer> e : hm.entrySet()){
            a=gcd((Math.min((int) e.getValue(),a)),(Math.max((int) e.getValue(),a)));
       // a=Math.min(a,c);
                              
    }
    if(a>=2)
        return true;
    return false;
            
        
    }
    
    public int gcd(int a,int b) {
        if(b==0)
            return a;
    return gcd(b,a%b);

    }
}