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
    public ListNode rotateRight(ListNode head, int k) {
        
   if(head==null || k==0) return head;
ListNode temp=head;
int count=0;
while(temp!=null){
    count++;
    temp=temp.next;
} 
k=k%count;
while(k>0){
head= rotate(head);
k--;
}
return head;
}

 
static ListNode rotate(ListNode head){
     if(head==null||head.next==null ) 
     return head;

    ListNode temp1=head;
     ListNode temp3=temp1;
    while(temp1.next.next!=null){
     temp1=temp1.next;
    }
     ListNode temp2=new ListNode(-1);
    
       temp2.next=temp1.next;
       temp2=temp2.next;
       temp1.next=null;
       temp2.next=temp3;
       return temp2;
}
}