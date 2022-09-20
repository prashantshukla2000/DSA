//if no of open=no. of close =n then we need to add that to the result set
//if no. of open is less than n we add ( to the stack
//if no of close < open then only we add close to )

class Solution {
    Stack<Character> stack=new Stack<Character>();
    List<String> res=new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        backtrack(0,0,n);
        return res;
    }
    public void backtrack(int open, int close, int n){
        if(open==n&& close==n)
        {
            Iterator i=stack.iterator();
            String temp="";
            while(i.hasNext()){
                temp=temp+i.next();
            }
            res.add(temp);
        }
        if(open<n){
            stack.push('(');
            backtrack(open+1,close,n);
            stack.pop();
        }
        if(close<open){
            stack.push(')');
            backtrack(open,close+1,n);
            stack.pop();
        }
    }
}