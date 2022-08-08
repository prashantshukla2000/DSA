class Solution {
    public int trap(int[] height) {
        if(height.length<1)
            return 0;
        int l=0;int r=height.length-1,res=0;
     int leftmax=height[l];
     int rightmax=height[r];
        while(l<r){
            if(leftmax<rightmax){
                l=l+1;
                leftmax=Math.max(leftmax,height[l]);
                res=res+leftmax-height[l];
            }else{
                  r=r-1;
                rightmax=Math.max(rightmax,height[r]);
                res=res+rightmax-height[r];
            }
        }
        return res;
      
        
    }
  
}