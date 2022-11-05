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
//Using the way of serching...where we search each row from last ..f 1 found go more back in the same....else 
//we go to down if any of the down rows have 1 in it...ie,they have more ones so we break out of that row to check down
class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int col=m-1,row=-1;
        for(int i=0;i<n;i++){
           for(int j=col;j>=0;j--){
               if(arr[i][j]==1){
                   col--;
                   row=i;
               }else{
                   break;
               }
           }
        }
        return row;
    }
}
    //OR Using Binary Serach

// class Solution {
//     int rowWithMax1s(int arr[][], int n, int m) {
//         // code here
//         int max=Integer.MAX_VALUE,ans=-1;
//         for(int i=0;i<n;i++){
//             int index=bs(arr[i],0,m-1);
//             if(index != -1 && index<max ){
//                 max=index;
//                 ans=i;
//             }
//         }
//         return ans;
//     }
//     int bs(int arr[],int low,int high){
//       if (high>=low){
//             int mid=(low+high)/2;
//             if((mid==0||arr[mid-1]==0)&&(arr[mid]==1)){
//             return mid;
//             }
//             else if(arr[mid]==0){
//              return   bs(arr,(mid+1),high);
//             }else{
//                 return bs(arr,low,(mid-1));
//             }
//         }
//         return -1;
//     }
// }