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
    public ListNode swapPairs(ListNode head) {
        if(head==null ||head.next ==null)
            return head;
       ListNode l1=head,l2=head.next;
        ListNode l3=l2.next;
         l2.next=l1;
         l1.next=l2;
         l1.next=swapPairs(l3);
        return l2;
    }
}