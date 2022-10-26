class Solution {
    public boolean isSameAfterReversals(int num) {
   long reverse = 0,number=num; int p=num; 
        while(number != 0)   
        {  
            long remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }  
    
    number=reverse;
    reverse=0;
      while(number != 0)   
        {  
            long remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10;  
        }  
    
     if(reverse==p)
         return true;
        return false;
    }
}
 