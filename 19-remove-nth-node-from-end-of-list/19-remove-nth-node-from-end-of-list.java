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
//CODE HERE 
ListNode temp=head;
int count=0;
while(temp!=null){
    count++;
    temp=temp.next;
}
ListNode temp1=new ListNode(0);
temp1.next=head;
ListNode tmp2=temp1;int i=0;
while(temp1!=null){
if((count-n)==i){
    temp1.next=temp1.next.next;
}else{
    temp1=temp1.next;
}
i++;
}
return tmp2.next;
}
    }