class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int m=1;
     for(int i=0;i<piles.length;i++){
          m=Math.max(m,piles[i]);
     }   
        int l=1,r=m;
       while(l<r){
           int mid=(l+r)/2;
           int s=0,i=0;
          while(i<piles.length){
               if(piles[i]%mid==0){
				s+=piles[i]/mid;
			}else{
				s+=(piles[i]/mid) + 1;
              }
           i++;
          }
              if(s<=h){
                 r=mid; 
              }else{
                  l=mid+1;    
              }    
       } 

        return r;
    
}
}