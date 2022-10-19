class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int a=target[0];int b=target[1];int c=target[2];
        boolean flag1=false,flag2=false,flag3=false;
        for(int val[]:triplets){
            if(val[0]>a||val[1]>b||val[2]>c)
                continue;
            if(val[0]==a)flag1=true;
            if(val[1]==b)flag2=true;
            if(val[2]==c)flag3=true;
          if(flag1==true&&flag2==true&&flag3==true)
            return true;
         
        } 
        return false;
    }
}