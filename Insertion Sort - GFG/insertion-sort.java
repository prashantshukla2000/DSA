//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{
  //Function to sort the array using insertion sort algorithm.
  //At every stage we have a sorted part and an unsorted part we take an ele from the unsorted ..pos..i...and 
  //try to put it in the right pos in the sorted part of the array
  public void insertionSort(int a[], int n)
  {
if(n<=1){//base condition
return;
}
//Now we know that single ele is sorted..so we need to have move ele...so we go back-> 5..4..3..2..1..
//so now after it hits base condition it will fo in 2..3..4..5
insertionSort(a,n-1);
int last=a[n-1]; //temporary variable so ele isn't lost
int j=n-2;
while(j>=0 && a[j]>last){
    a[j+1]=a[j];
    j--;
}
    a[j+1]=last;
}
}
// class Solution
// {
//   public void insertionSort(int a[], int n)
//   {
//       //code here
//       int i,j;
//       for( i=1;i<n;i++){
//           int temp=a[i];
//           for(j=i-1;j>=0 && a[j]>temp ;j--){
//               a[j+1]=a[j];//we keep shifting elements till we find any ele less than temp.
//           }
//           a[j+1]=temp;//we put the ele in its right position j+1 as it is bigger than ele at a[j]
//       }
//   }
// }