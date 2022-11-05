//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max=Integer.MAX_VALUE,ans=-1;
        for(int i=0;i<n;i++){
            int index=bs(arr[i],0,m-1);
           // System.out.println(index);
            if(index != -1 && index<max ){
                max=index;
                ans=i;
            }
        }
        return ans;
    }
    int bs(int arr[],int low,int high){
      if (high>=low){
            int mid=(low+high)/2;
            if((mid==0||arr[mid-1]==0)&&(arr[mid]==1)){
            return mid;
            }
            else if(arr[mid]==0){
             return   bs(arr,(mid+1),high);
            }else{
                return bs(arr,low,(mid-1));
            }
        }
        return -1;
    }
}