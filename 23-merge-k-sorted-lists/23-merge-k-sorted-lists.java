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
      PriorityQueue <Integer> queue=new PriorityQueue<>();
for(ListNode head:lists){
while(head!=null){
queue.add(head.val);
head=head.next;
}
}

   ListNode dummy=new ListNode(0);
   ListNode temp=dummy;
while(!queue.isEmpty())
{temp.next=new ListNode(queue.poll());
temp=temp.next;
}
return dummy.next;

    }
}