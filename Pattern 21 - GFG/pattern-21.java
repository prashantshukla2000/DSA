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
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
     for(int i=0;i<n;i++){
         for(int j=n-1;j>=0;j--){
             if(i==0||j==0||j==n-1||i==n-1)
         {
             System.out.print("*");
         }else{
             System.out.print(" ");
             
         }  }           System.out.println();

             
         
     }   // code here
    }
}