public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
   int count=0;
        String s=Integer.toBinaryString(n);
        int i=0;
        System.out.println(s);
        while(i<s.length()){
         if(s.charAt(i)=='1'){
             count++;}
            i++;
     }   
    
    return count;
}
}