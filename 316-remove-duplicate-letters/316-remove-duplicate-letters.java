class Solution {
    public String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i),i);
            }else{
                 hm.put(s.charAt(i),i);
            }
        }
        //System.out.print(hm);
       //return "abc";
        int n=s.length();
        Stack<Character> stack=new Stack<Character>();
       Set<Character> set=new HashSet<Character>();
        for(int i=0;i<n;i++){
            if(set.contains(s.charAt(i))){
                continue;
            }
            
                while((!stack.isEmpty() )&&(stack.peek()>s.charAt(i)) && (hm.get(stack.peek())>i) ){
                   char t= stack.pop();
                    set.remove(t);
                }
        stack.push(s.charAt(i));        
          set.add(s.charAt(i));  
        }
        
        StringBuilder ps=new StringBuilder();
        while(!stack.isEmpty())
        {
           // ps=ps+stack.pop();
             ps.append( stack.pop() );
        }
        
     return ps.reverse().toString();
    }
}