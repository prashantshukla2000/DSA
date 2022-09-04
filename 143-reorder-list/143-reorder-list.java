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
    public void reorderList(ListNode head) {
         if(head==null||head.next==null)
            return ;
      ListNode back=cut(head);
        back=Reverse(back);
        ListNode front=head;
        ListNode a=new ListNode(0);
         while(back!=null){
         a.next=front;
             front=front.next;
             a=a.next;
             a.next=back;
             back=back.next;
             a=a.next;
        }
        a.next=front;
     head=a;
    }
    public ListNode cut(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast.next!=null &&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next!=null){
            slow=slow.next;
        }
        ListNode t=slow.next;
        slow.next=null;
        return t;
    }
    public ListNode Reverse(ListNode head){
        if(head==null ||head.next==null)
            return head;
        ListNode a=head;
        ListNode b=head.next;
        ListNode c=head.next.next;
        while(c!=null){
            b.next=a;
            a=b;b=c;c=c.next;
        }
        head.next=null;
        b.next=a;
        return b;
    }
}