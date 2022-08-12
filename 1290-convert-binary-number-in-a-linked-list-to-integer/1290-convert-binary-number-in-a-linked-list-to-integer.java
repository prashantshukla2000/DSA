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
    public int getDecimalValue(ListNode head) {
        int count=0,sum=0;
ListNode temp=head;
ListNode curr=head;
while(temp!=null){
    count++;
    temp=temp.next;
}
count--;
while(curr!=null){
    sum=sum+(int)Math.pow(2,count)*curr.val;
    count--;
    curr=curr.next;
}
return sum;
    }
}