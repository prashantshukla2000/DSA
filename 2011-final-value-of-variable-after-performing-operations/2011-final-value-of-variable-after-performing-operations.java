class Solution {
    public int finalValueAfterOperations(String[] arr) { 
int count=0,i=0,n=arr.length;
while(i<n){
    
    String sb=arr[i] ;
    if(sb.equalsIgnoreCase("++X")||sb.equalsIgnoreCase("X++"))
    count++;
    else if(sb.equalsIgnoreCase("--X")||sb.equalsIgnoreCase("X--"))
    count--;
    i++;
}
return count;
}
   
    
}