class MedianFinder {
 PriorityQueue<Integer> firstmaxHeap, secminHeap;
    public MedianFinder() {
         firstmaxHeap = new PriorityQueue<>(Collections.reverseOrder());
        secminHeap = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        firstmaxHeap.add(num);
        if(!firstmaxHeap.isEmpty() && !secminHeap.isEmpty() && firstmaxHeap.peek() >secminHeap.peek()){
            int val=firstmaxHeap.poll();
            secminHeap.add(val);
        }
        if(firstmaxHeap.size()>secminHeap.size()+1){
             int val=firstmaxHeap.poll();
            secminHeap.add(val);
        }
        if(secminHeap.size()>firstmaxHeap.size()+1){
           int val=secminHeap.poll();
            firstmaxHeap.add(val); 
        }
      
    }
    
    public double findMedian() {
        if(firstmaxHeap.size()>secminHeap.size()){    //then we have odd no of elemenets
            return firstmaxHeap.peek();
        }
          if(secminHeap.size()>firstmaxHeap.size()){    //then we have odd no of elemenets
            return secminHeap.peek();
        }
           //else we have bpth sizes are equal so we have even no of elemenets
            return (float)(secminHeap.peek()+firstmaxHeap.peek())/2;
        
        
        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */