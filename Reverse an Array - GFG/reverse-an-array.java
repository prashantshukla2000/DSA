/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
	 int t;
     
 Scanner sc = new Scanner(System.in);
 t=sc.nextInt();

   while(t>=1)
 {
     int n=sc.nextInt();
       int [] a = new int [n];
      for(int j=0;j<=n-1;j++)
      {
          a[j]=sc.nextInt();
      }	
      rev(a,0,n-1);
      printarr(a,n);
      t--;
}
	
}

 static void rev(int a[],int s,int e){
    if(s>=e)
    return;
   int temp=a[s];
    a[s]=a[e];
    a[e]=temp;
    rev(a,s+1,e-1);
    
}

static void printarr(int a[],int n){
    for(int i=0;i<n;i++){
        System.out.print(a[i]+" ");
    }
    System.out.println();
}
}
