//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long[] ans=new Long[2];
      Long hcf=  hcf(A,B);
        Long lcm=(A*B)/hcf;
        ans[0]=lcm;
        ans[1]=hcf;
        return ans;
    }
    public static Long hcf(Long a,Long b){
        if(a==0)
        return b;
        if(b==0)
        return a;
        return hcf(b,a%b);
        
    }
};