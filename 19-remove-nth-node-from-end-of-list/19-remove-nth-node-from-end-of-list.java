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
    head= reverse(head); 
        ListNode temp=new ListNode(0,head);
        ListNode res=temp;
        int i=0;
        while(temp!=null){
            if(i==(n-1)){
                temp.next=temp.next.next;}
            else{
                temp=temp.next;
            }
            i++;
        }
        return reverse(res.next);
    }
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null)
            return head;
       ListNode a=head,b=head.next,c=head.next.next;
        while(c!=null){
            b.next=a;
            a=b;b=c;
            c=c.next;
        }
        head.next=null;
        b.next=a;
        return b;
    }
    
}