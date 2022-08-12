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
    public ListNode reverseBetween(ListNode head, int left, int right) {
     ListNode dummy=new ListNode(0,head);
        //Reach node at position left
        ListNode leftprev=dummy;
        ListNode curr=head;
        for(int i=1;i<=left-1;i++)
        {leftprev=curr;
        curr=curr.next;
        }
        //now curr="left", prev="Node before left"
        //we reverse each element from left to right up until the rigt index
        ListNode prev=null;
        for(int i=1;i<=right-left+1;i++){
           ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        } //updtaing the pointers to jon all the three parts.
        leftprev.next.next=curr;
        leftprev.next=prev;
        return dummy.next;
    }
}