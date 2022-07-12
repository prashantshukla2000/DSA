class Solution {
    public double myPow(double x, int n) {
      
//        boolean flag1=true ; //for x negative or positive
//        boolean flag2=true;  //for x negative or positive
//         if(x<0){
//             flag1=false;}
//         if(n<0){
//             flag2=false;}
//         x=Math.abs(x);
//         n=Math.abs(n);
//           if(x==0){                //base cases
//             return 0;}
//         if(n==0){
//             return 1;}
//         if(n==1 && flag2==false){
//             return 1/x;}
//         else if(n==1&&flag2==true){
//             return x;}
        
//         double halfans=0.00;
//         halfans=myPow(x,n/2);
//         double ans=1;
//         if(n%2==1){
//            ans=halfans*halfans*x; 
//         }else{
//             ans=halfans*halfans;}
        
//         if(flag2==false &&n%2==1)
//             ans= ans*-1;
//         if(flag2==false)
//             ans=1/ans;
        
//         return ans;
            
          if(n == 0)
            return 1;
        else{
            double res = myPow(x, n/2);
            if(n % 2 < 0)
                return res * res / x;
            else if(n % 2 > 0)
                return res * res * x;
            else
                return res * res;
        }
    }
}