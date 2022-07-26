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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return head;
        
        ListNode p=new ListNode(0);
        p.next=head;
        head=p;
        
        ListNode l=head.next,r=head.next;
        
        while(r!=null){
            if(l.val==r.val){
                r=r.next;
            }
            else if(l.next==r){
                p.next=l;
                p=l;
                l=r;
            }
            else{
                l=r;
            }
        }
        if(l.next!=null)
        p.next=null;
        else
       p.next=l;
        
        return head.next;
    }
}