public class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        if (m == 0 && n== 0) {
            return 0;
        }
        //one of the strings are null
        if (m == 0 || n == 0) {
            return Math.max(m, n);
        }
        int[][] cost = new int[m + 1][n + 1];
        for(int i = 0; i <m+1; i++)
            cost[i][n] = (m)-i;
        for(int i = 1; i <= n; i++)
            cost[m][i] = (n)-i;
        
        for(int i = m-1; i>=0; i--) {
            for(int j=n-1; j >=0; j--) {
                if(word1.charAt(i) == word2.charAt(j))
                    cost[i ][j] = cost[i+1][j+1];
                else {
                  int a =1+ cost[i + 1][j];
                    int b = 1+cost[i][j+1];
                    int c = 1+cost[i+1][j + 1];
                    cost[i][j] = Math.min(Math.min(a,b),c);
                }
            }
        }
        return cost[0][0];
    }
}