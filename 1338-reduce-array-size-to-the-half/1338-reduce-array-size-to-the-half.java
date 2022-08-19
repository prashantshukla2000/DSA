
class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int array[]=new int[hm.values().size()];
        int i=0;
for(int j:hm.values()){
        array[i++]=j;
    }
        Arrays.sort(array);
        int half=arr.length/2,removed=0,len=array.length-1,ans=0;
        while(removed<half){
            ans++;
            removed=removed+array[len--];
            
        }
        return ans;
    }
}