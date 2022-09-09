/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0)
            return null;
    PriorityQueue <ListNode>queue=new PriorityQueue<ListNode>((a,b)->{return a.val-b.val;});
        ListNode head=new ListNode(0);
        ListNode temp=head;
        for(int i=0;i<lists.length;i++){
           if(lists[i]!=null){
            ListNode e= lists[i];
          while(e!=null){
                queue.add(e);
               e=e.next;
            }
        }
        }
        if(queue.isEmpty())
            return null;
        while(!queue.isEmpty()){
           ListNode ele=queue.poll();
            ele.next=null;
            temp.next=ele;
            temp=temp.next;
           
        }
        return head.next;
    }

}