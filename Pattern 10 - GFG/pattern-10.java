//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int rows=n;
        for (int i= 0; i<= rows-1 ; i++)
        {
            for (int j=0; j<=i; j++) {
                System.out.print("*"+ " "); 
                
            } System.out.println(""); }
    for (int k=n-1; k>0; k--)
        {
            for(int j=1; j <=k;j++)
            {
                System.out.print("*"+ " ");
            }
            System.out.println("");
        }
    }
}