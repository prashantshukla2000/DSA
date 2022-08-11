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
        if(lists==null ||lists.length==0)
            return null;
        PriorityQueue <ListNode> queue=new PriorityQueue<ListNode>((a,b)->{
            return a.val-b.val;
        });
        ListNode head=new ListNode(0);
        ListNode temp=head;
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                queue.add(lists[i]);
            }
        }
        if(queue.isEmpty()) {return null;}
        while(!queue.isEmpty()){
            ListNode ele=queue.poll();
            temp.next=ele;
           temp=temp.next;
            if(temp.next!=null){
                queue.add(temp.next);
            }
        }
        return head.next;
    }
}