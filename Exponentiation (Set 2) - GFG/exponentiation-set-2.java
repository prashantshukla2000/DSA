// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {   
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int a = sc.nextInt();
            long b = sc.nextLong();

            Solution ob = new Solution();
            System.out.println(ob.power(a, b));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static long power(int x, long n){
                  if(n == 0)
            return 1;
        else{
            long res = (power(x, n/2))%1000000007;
            if(n % 2 < 0)
                return ((res)%1000000007 * (res)%1000000007 / x )%1000000007;
            else if(n % 2 > 0)
                return ((res)%1000000007 * (res)%1000000007 * x)%1000000007;
            else
                return ((res)%1000000007 * (res)%1000000007)%1000000007;
        }
        //complete the function here
    }
}