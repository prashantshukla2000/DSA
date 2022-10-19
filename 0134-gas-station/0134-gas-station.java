class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int g=0,c=0;
        for(int i=0;i<gas.length;i++) {
           g=g+gas[i];
           c=c+cost[i];
       }
        if(g<c) return -1;
        int total=0,index=0;
        for(int i=0;i<gas.length;i++){
           total=total+gas[i]-cost[i];
            if(total<0)
            {
                total=0;
                index=i+1;
            }
        }
        return index;
    }
}