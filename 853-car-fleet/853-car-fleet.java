//we go from las to first car after sorting as if we go from from starting to end speed of the car could have been changed bec. of the car infront of it,so we go grom last to first
//w sort them as then only the car whic has covered more ground then it intially will be present after it
//time..0(nlogn)...o(space)
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
         if (position.length == 1) return 1;
        HashMap<Integer,Integer> hm=new    HashMap<Integer,Integer> ();
        Stack<Double> stack=new Stack<Double>();
        for(int i=0;i<position.length;i++){
            hm.put(position[i],speed[i]);
        }
        Arrays.sort(position);
        for(int i=position.length-1;i>=0;i--){
            double currentTime = (((double)target -position[i] )/hm.get(position[i]));
             if(!stack.isEmpty()&& currentTime<=stack.peek()){
                       continue;
            }else{
                        stack.push(currentTime);
            }
        }
       return stack.size();
    }
}