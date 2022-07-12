class Solution {
    public boolean isValid(String s) { Stack st=new Stack();
        
        int n=s.length();
        for(int i=0;i<n;i++)
            if(i==0)

            {
                st.push(s.charAt(i));
            }
        else{
            if(st.size()!=0&&s.charAt(i)==')'&&(char)st.peek()=='(')
            {
                st.pop();
            } else if(st.size()!=0&&s.charAt(i)=='}'&&(char)st.peek()=='{')
            {
                st.pop();
            }
             else if(st.size()!=0&&s.charAt(i)==']'&&(char)st.peek()=='[')
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
            if(st.size()==0){
                return true;
            }
        return false;
            
        
    }
}