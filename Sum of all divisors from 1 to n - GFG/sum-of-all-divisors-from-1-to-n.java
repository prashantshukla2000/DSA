//{ Driver Code Starts
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
            int N=sc.nextInt();
			
            
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static long sumOfDivisors(int num){
        // code here
    long sum = 0;
    for (long i = 1; i <= Math.sqrt(num); i++) {
        long t1 = i * (num / i - i + 1); // adding i every time it appears with numbers greater than or equal to itself
        long t2 = (((num / i) * (num / i + 1)) / 2) - ((i * (i + 1)) / 2); // adding numbers that appear with i and are greater than i
        sum += t1 + t2;
    }
    return sum;
    }
}