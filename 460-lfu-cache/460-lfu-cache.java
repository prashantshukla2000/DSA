class LFUCache {
   Map<Integer,ListNode> keymap=new HashMap<>();//for key -Nodes 
 Map<Integer,DoublyList> freqmap=new HashMap<>();//for frequency and the nodes of that frequency........it can acceesd using the keymap.freq as that is same the frequency of freqmap
    int curcapacity=0;
        int maxcapacity;
    public LFUCache(int capacity) {
      this.maxcapacity= capacity;
    }
    
    public ListNode getNode(int key){
         if(!keymap.containsKey(key))
           return null;
        
        ListNode curnode=keymap.get(key);//retrieve current node
        DoublyList list=freqmap.get(curnode.freq);//remove curnode from current frequency list
        list.deleteNode(key);
        curnode.freq++;
        //update the frequency of the curnode;
        //add curnode on to a higher frequency list
        if(!freqmap.containsKey(curnode.freq)){//if that freq is nortp resent we create a new frequency keyvalue
            freqmap.put(curnode.freq,new DoublyList());
        }
        freqmap.get(curnode.freq).addNode(curnode);//add the curnode into the freqmap
        return curnode;
    }
    public int get(int key) {
       if(!keymap.containsKey(key))
           return -1;
        ListNode curnode=getNode(key);
        return curnode.val;
    }
    
    public void put(int key, int value) {
     if(maxcapacity==0)
         return;
        
        if(keymap.containsKey(key)){//if node already present we update it.
            //retrieve current node from current freq list
          ListNode curnode=getNode(key);
            curnode.val=value;
        }
        else{  //insert value if not present
            if(curcapacity==maxcapacity){ //if list is full the finding the lowest frequency in the frequency map to remove the node.
                int lowestfreq=Integer.MAX_VALUE;
                for(Integer freq:freqmap.keySet()){
                    if(freqmap.get(freq).map.isEmpty())
                        continue;
                    lowestfreq=Math.min(lowestfreq,freq);
                }
                //removing the leat recently sed that is head node from the lowest frequency
                DoublyList list=freqmap.get(lowestfreq);
                ListNode curnode=list.deleteHead();
                keymap.remove(curnode.key);
                curcapacity--;
            }
            //Now inserting the new element;
            int curfreq=1; //to set the frequency of new element
          ListNode curnode=new ListNode(key,value);
            keymap.put(key,curnode);
              if(!freqmap.containsKey(curfreq)){
            freqmap.put(curfreq,new DoublyList());
        }
        freqmap.get(curfreq).addNode(curnode);
            curcapacity++;
        }
        
    }
}

class ListNode{
    ListNode prev,next;
    int val,key,freq;
    ListNode(){
        
    }
    ListNode(int key,int val){
        
            this.key=key;
        this.val=val;
    
        this.freq=1;
    }
    
}
//Doubly link list to store for a frequency all the keys...
class DoublyList{
    Map<Integer,ListNode> map=new HashMap<>();
    ListNode head,tail;
    
   public DoublyList(){
       head=new ListNode();
       tail=new ListNode();
       head.next=tail;
       tail.prev=head;
   }
    public void addNode(ListNode curnode){
        ListNode tailprev=tail.prev;
        tailprev.next=curnode;
        curnode.prev=tailprev;
        tail.prev=curnode;
        curnode.next=tail;
        map.put(curnode.key,curnode);
    }
    
    public ListNode deleteNode(int key){
        if(!map.containsKey(key))
            return null;
        ListNode curnode=map.get(key);
        ListNode prevnode=curnode.prev;
        ListNode nextnode=curnode.next;
        prevnode.next=nextnode;
        nextnode.prev=prevnode;
        map.remove(key);
        return curnode;
    }
    
    public ListNode deleteHead(){
        if(head.next==tail)
            return null;
        ListNode firstNode=head.next;
        return deleteNode(firstNode.key);
    }
}


/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */