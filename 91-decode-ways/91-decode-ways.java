class Solution {
    HashMap<Integer,Integer> dp=new HashMap<>();
    int res;
    public int numDecodings(String s) {
        int size = s.length();
        dp.put(size, 1); //if we get an empty string w want to reurn 1
        return dfs(s, 0); 
    }
        private int dfs(String s, int i) {
        int size = s.length();
        
        if (dp.containsKey(i)) {
            return dp.get(i);
        }
        if (s.charAt(i) == '0') {
            return 0;
        }
        res = dfs(s, i + 1);
        if ((i + 1 < size) && ((s.charAt(i) == '1') 
            || (s.charAt(i) == '2') && (Character.getNumericValue(s.charAt(i + 1)) < 7))
            ) {
            res += dfs(s, i + 2);
        }
        dp.put(i, res);
        return res;
    }
}

