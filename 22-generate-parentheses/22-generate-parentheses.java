class Solution{
public List<String> generateParenthesis(int n) {
    List<String> result = new ArrayList<>();
    dfs(n, n, result, "");
    return result;
}

public void dfs(int left, int right, List<String> result, String s) {
    if(right<left||left==-1||right==-1) 
        return;

 if (left==0 &&right ==0) //if both of them=0 then we correctly reach to a string with n (, )
            result.add(s);
    else {
        if (left > 0) dfs(left - 1, right, result, s + "(");//we go to left side and add open braces
        if (right > left) dfs(left, right - 1, result, s + ")");//we go to right side and add close braces

    }
}
}

