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
        ListNode h=cutinhalf(head);
        h=reverse(h);
      ListNode p=head;
        
        while(h!=null){
           ListNode x=h.next;
            h.next=p.next;
            p.next=h;
            p=p.next.next;
            h=x;
        }
       
        
    }
    public ListNode cutinhalf(ListNode head){
        ListNode p1=head,p2=head.next;
        while(p2.next!=null&&p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        if(p2.next!=null){     //for odd we will break at one more.
            p1=p1.next;
        }
        ListNode t=p1.next;
        p1.next=null;
        return t;
        
    }
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode p=head,c=head.next,n=head.next.next;
        while(n!=null)
        {
            c.next=p;
            p=c;
            c=n;
            n=n.next;
        }
        head.next=null;
        c.next=p;
        return c;
    }

}