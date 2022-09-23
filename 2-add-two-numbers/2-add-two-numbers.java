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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode l3=new ListNode(0);
        ListNode p=l3;
        int c=0,sum=0;
        while(l1!=null &&l2!=null){
            sum=l1.val+l2.val+c;
            c=sum/10;
            p.next=new ListNode (sum%10);
            p=p.next;
            l1=l1.next;
            l2=l2.next;
        }
        sum=0;
        if(l2!=null)
            l1=l2;
        while(l1!=null){
            sum=l1.val+c;
            c=sum/10;
            p.next=new ListNode (sum%10);
             p=p.next;
            l1=l1.next;
        }
        if (c!=0){
            p.next=new ListNode(c);
        }
        return l3.next;
    }
}