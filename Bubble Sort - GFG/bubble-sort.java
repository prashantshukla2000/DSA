//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution
{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n)
    {
        //base condition
   if(n==0||n==1)
   return;
   //since we are soting from back by placing the larget ele first we can 
   //check till n-1 only as we know after that are sorted
   for(int i=0;i<n-1;i++){ 
       if(arr[i]>arr[i+1]){
           swap(arr,i,i+1);
       }
   }
   bubbleSort(arr,n-1);
   
    }
    public static void swap(int a[], int i, int j){
        int tem=a[i];
        a[i]=a[j];
        a[j]=tem;
    }
}
// class Solution
// {
//     //Function to sort the array using bubble sort algorithm.
// 	public static void bubbleSort(int arr[], int n)
//     {
//         //code here
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){   //also works for n-1
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//     }
// }

//{ Driver Code Starts.

class Sorting
{
    //method to print the Elements of the array
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	public static void main(String args[])
	{
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total testcases
		int t = sc.nextInt();
		while(t>0)
		{
		    //taking total elements
			int n = sc.nextInt();
			
			//creating a new array of length n
			int arr[] = new int[n];
			
			//inserting elements to the array
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt(); 
			}
			
			
			//calling bubbleSort() method
			new Solution().bubbleSort(arr,n);
			
			//calling printArray() method
			printArray(arr);
			
		t--;	
		}
	}

}
// } Driver Code Ends