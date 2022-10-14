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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)
            return null;
     ListNode temp=head;int c=0;
        while(temp!=null){
            c++;
            temp=temp.next;
        }int i=0;
         ListNode copyHead = head;
        int mid = c/ 2;
         while (mid-- > 1) {
            head = head.next;
        }
         head.next = head.next.next;
 
        return copyHead;
        
    }
}