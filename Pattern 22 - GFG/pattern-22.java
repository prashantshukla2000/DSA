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
        // code here
        int start,end,size;
 size = n*2 - 1;
start=0;
end=size - 1;
int arr[][]=new int[size][size];


// Complete the code to print the pattern.
  while (n != 0) {


  for (int i = start; i <= end ; i++ ) {
   for (int j = start; j <= end; j++) {
       if ((i==start) || (i==end) || (j==start) || (j==end)) {
           arr[i][j]=n;
       }
   }
  }
    start++; end--; n--;

  }
  
   for (int i = 0; i <size; i++ ) {
   for (int j = 0; j <size; j++) {
  System.out.print(arr[i][j]+" ");
   }System.out.println();
  }
    }
}