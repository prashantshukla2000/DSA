class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack=new Stack<Character>();
        StringBuilder sb=new StringBuilder(s);
        if(s.length()<=1)
            return s;
         stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if((!stack.isEmpty())&&(stack.peek()==s.charAt(i))){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        String st="";
        while(stack.size()>0){
            st=stack.peek()+st;
            stack.pop();
        }
        return st;
    }
}