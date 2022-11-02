//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long N=sc.nextLong();
			
            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for(long num : ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
// class Solution{
//     static ArrayList<Long> list=new ArrayList<Long>();
//     static ArrayList<Long> factorialNumbers(long N){
//         // code here
//       return namer(1, N);
//     }
//     public static ArrayList<Long> namer(long i,long n) {
//   if(fact(i)<=n){
//       list.add(fact(i));
//      return namer(i+1,n); 
//      }else
//      return list;
      
//     }
//     public static  long fact(long n){
//         if(n <= 1){
//             return 1;
//         }
//         return n * fact(n-1);
//     }
// }


class Solution{
    static ArrayList<Long> factorialNumbers(long N){
       ArrayList<Long> ans=new ArrayList<Long>();
   for(int i =1; i<=N ;i++){
            if(fact(i)<=N){
              ans.add(fact(i));                
            }else{
                break;
            }
        }
        return ans;
    }
    public static  long fact(long n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
}