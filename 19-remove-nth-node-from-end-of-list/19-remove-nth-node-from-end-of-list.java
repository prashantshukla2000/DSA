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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode temp=new ListNode(0,reverse(head));
        ListNode t=temp;
        int i=0;
        while(i<n-1){
         
                temp=temp.next;
            i++;
        }
            temp.next=temp.next.next;
        return reverse(t.next);
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