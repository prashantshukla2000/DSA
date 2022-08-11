   public class Solution {
            public int findKthLargest(int[] nums, int k) {
                PriorityQueue<Integer> largeK = new PriorityQueue<Integer>(k+1);
    //minheap.
                for(int el : nums) {
                    if (largeK.size() < k) {
                         largeK.add(el);
                       
                    }else{
                        if(el>largeK.peek() ){
                             largeK.add(el);
                            largeK.poll();
                        }
                    }
                }

                return largeK.poll();
            }
}
