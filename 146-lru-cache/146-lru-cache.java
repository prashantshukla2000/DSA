class Node{
    int key;
    int val;
    Node prev;
    Node next;
    public Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}
class LRUCache {
  HashMap<Integer,Node> map=null;
    Node head=new Node(-1,-1);
    Node tail=new Node(-1,-1);
    int capacity=0;
    
    public LRUCache(int capacity) {
      this.capacity=capacity;
        map=new HashMap<>();
        join(head,tail);
    }
    public void join(Node n1,Node n2 ){
        n1.next=n2;
        n2.prev=n1;
    }
    public void remove(Node node){
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }
    public void movetohead(Node head,Node node){//ensuring that the dummy node is in its place and to insert node to the front after removing it.
        Node next=head.next;
        join(head,node);
        join(node,next);
    }
    
    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        Node node=map.get(key); 
        remove(node);
        movetohead(head,node);//we add to the head of the link list as it is the most recently used node so it must be in the list at the top
        return node.val;
    }
    
    public void put(int key, int value) {
       if(map.containsKey(key)){//if found remove so,add the new value as a new key-value pair
          Node node=map.get(key);
           remove(node);
       } 
        else if(map.size()==capacity){ //if capacity is reched we rmove the last node ,ie,one before the last dummy
        map.remove(tail.prev.key);
        remove(tail.prev);
        }
        Node newNode=new Node(key,value);
        movetohead(head,newNode);
        map.put(key,newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */