//{ Driver Code Starts
import java.util.*;
class Sorting
{
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    // Driver program
    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();

			
			new Solution().quickSort(arr,0,n-1);
			printArray(arr);
		    T--;
		}
} }
// } Driver Code Ends


class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
      if(low<high){
          int pivot=partition(arr,low,high);
          quickSort(arr,low,pivot-1);
          quickSort(arr,pivot+1,high);
      }
           }
           
    static int partition(int arr[], int low, int high)
    {  
        //take ele from start as pivot..
        //find the ele greater than it .. from beginning(i) and less than it(j)..from back and swap them....
        //then when j becomes graeter equal than(>=) i than we swap the pivot with the less ele(j)..
        //this was the first itteration we go and call the quick sort for the left side of it and the right side of it
        // your code here
        int pivot=arr[low];
        int i=low,j=high;//both the pointers..one starts at beg..other at last
        while(i<j){
        while(i<=arr.length-1 &&arr[i]<=pivot ){//keep going till smaller to find the ele that isn't,ie,larger than pivot
            i++;
        }
        while(j>=0 && arr[j]>pivot ){//keep going till we have larger ,if found smaller or equal stop
            j--;
        }
        if(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
        }
        //Now we swap the pivot(a[low]) with the j element...
            int temp=arr[low];
            arr[low]=arr[j];
            arr[j]=temp;
            return j;//returns the position pivot is now...
    } 
}
