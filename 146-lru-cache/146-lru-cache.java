class Node{
    int key;
    int val;
    Node next;
    Node prev;
    public Node(int key,int val){
        this.key=key;
        this.val=val;
    }
}


class LRUCache {
    Map<Integer,Node> mp=null;
Node head=new Node(-1,-1);
Node tail=new Node(-1,-1);
int capacity=0;

    public LRUCache(int capacity) {
          mp=new HashMap<Integer,Node>();
    join(head,tail);
    this.capacity=capacity;
        
    }
    public void join(Node n1,Node n2){
    n1.next=n2;
    n2.prev=n1;
}

public void remove(Node node){
    node.prev.next=node.next;
    node.next.prev=node.prev;
}
    public void moveToHead(Node head,Node node){
    Node next=head.next;
    join(head,node);
    join(node,next);
}
    
    public int get(int key) {
         if(!mp.containsKey(key)){
        return -1;
    }
    Node node=mp.get(key);
    remove(node);
    moveToHead(head,node);
    return node.val;
    }
    
    public void put(int key, int val) {
         if(mp.containsKey(key)){
        Node node=mp.get(key);
        remove(node);
    }else if(mp.size()==capacity){
        mp.remove(tail.prev.key);
        remove(tail.prev);
    }
    Node node=new Node(key,val);
    moveToHead(head,node);
    mp.put(key,node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */