class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> l=new ArrayList<>();
        for(int i=1;i<=n;i++){
        if(i%3==0&&i%5==0){
            l.add("FizzBuzz");}
       else if(i%3==0){
          l.add("Fizz");}
       else if(i%5==0){
        l.add("Buzz");}
        else 
         {
          String s="";
          s=s+i;
          l.add(s);
         }
            }
        return l;
    }
}