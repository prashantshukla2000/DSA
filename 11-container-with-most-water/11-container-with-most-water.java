class Solution {
    public int maxArea(int[] height) {

       
        int maxwater=0,water=0,hl=0,hr=0;
        int l=0,r=(height.length)-1;
       while(l<r ){
           hl=height[l];
           hr=height[r];
           water=Math.min(hl,hr)*(r-l);
           maxwater=Math.max(water,maxwater);
           
           if(hl<=hr)
               l=l+1;
           if(hr<=hl)
               r=r-1;
       } return maxwater;
       
        

    }
}