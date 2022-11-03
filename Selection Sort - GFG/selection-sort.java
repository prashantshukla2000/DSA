//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n]; 
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
		
			Solution obj = new Solution();
			obj.selectionSort(arr, n);
			
			for(int i=0;i<n;i++)
		    	System.out.print(arr[i]+" ");
		    System.out.println();
			t--;
		}
		
	}
}

// } Driver Code Ends


class Solution
{
	int  select(int arr[], int min_index)
	{
       for(int j=min_index+1;j<arr.length;j++)
	    {if(arr[j]<arr[min_index]){
	        min_index=j;
	    }
	}	   return min_index; 

	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++){
	      int min_index=select(arr,i)  ;
	        
	    int temp=arr[min_index];
	    arr[min_index]=arr[i];
	    arr[i]=temp;

	        
	    }
	}
}