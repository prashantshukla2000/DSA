//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int arr[], int N, int k) {
        //Complete the function
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,maxlen=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(sum==k){
                maxlen=i+1;
            }
            if(map.containsKey(sum-k)){
                 if (maxlen < (i - map.get(sum - k)))
                          maxlen = i - map.get(sum - k);
                  }
            }
            return maxlen;
        }
    }
    
    



//doesn't work for the negative numbers
// class Solution{
//  // Function for finding maximum and value pair
//     public static int lenOfLongSubarr (int nums[], int n, int k) {
//   int start = 0, end = -1, sum = 0, maxLength = 0;
//   while (start < n) {
//     while ((end + 1 < n) && (sum + arr[end + 1] <= k))
//       sum += arr[++end];

//     if (sum == k)
//       maxLength = Math.max(maxLength, (end - start + 1));

//     sum -= arr[start];
//     start++;
//   }
//   return maxLength;
//     }
//     }