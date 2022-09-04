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
//CODE HERE 
// ListNode temp=head;
// int count=0;
// while(temp!=null){
//     count++;
//     temp=temp.next;
// }
// ListNode temp1=new ListNode(0);
// temp1.next=head;
// ListNode tmp2=temp1;int i=0;
// while(temp1!=null){
// if((count-n)==i){
//     temp1.next=temp1.next.next;
// }else{
//     temp1=temp1.next;
// }
// i++;
// }
// return tmp2.next;
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
if(head==null||head.next==null)
    return null;
ListNode a=new ListNode(0,Reverse(head));
        ListNode temp=a;
        int i=0;
        while(a!=null){
            if(i==n-1){
                a.next=a.next.next;
            }
            else{
            a=a.next;
            }
            i++;
        }
        
        return Reverse(temp.next);
}
    public ListNode Reverse(ListNode head){
        if(head==null||head.next==null)
            return head;
    ListNode a=head;
    ListNode b=head.next;
    ListNode c=head.next.next;
        while(c!=null){
            b.next=a;
            a=b;
            b=c;
            c=c.next;
        }
        head.next=null;
        b.next=a;
        return b;       
    }
    }