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
    public ListNode oddEvenList(ListNode head) {
     if(head==null||head.next==null||head.next.next==null)
         return head;
        ListNode o=head,e=head.next;
  while(e!=null&&e.next!=null){
      ListNode x=e.next;
      e.next=e.next.next;
      x.next=o.next;
      o.next=x;
      o=o.next;
      e=e.next;
  }
        return head;
    }
}