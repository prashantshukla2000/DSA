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
        back=reverse(back);
        ListNode l3=new ListNode(-1);
        ListNode front=head;
        while(back!=null){
            ListNode x=back.next;
           back.next=front.next;
            front.next=back;
            front=front.next.next;
            back=x;
        }
        
    }
    public ListNode cut(ListNode head){
        ListNode slow=head,fast=head.next;
        while(fast.next!=null && fast.next.next!=null){
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
    public ListNode reverse(ListNode head){
          if(head==null ||head.next==null)
            return head;

        ListNode prev=head,curr=head.next,nex=head.next.next;
        while(nex!=null){
            curr.next=prev;
            prev=curr;
            curr=nex;
            nex=nex.next;
        }
        curr.next=prev;
        head.next=null;
        return curr;
    }
    
}