class Solution {
    public boolean canJump(int[] arr) {
        int goal=arr.length-1;
for(int j=arr.length-2;j>=0;j--)
{if(arr[j]+j>=goal){
    goal=j;
}
}
if(goal==0)
return true;
return false;
    }
}