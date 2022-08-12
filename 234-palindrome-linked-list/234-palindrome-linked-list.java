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
    public boolean isPalindrome(ListNode head) {
        
    
if(head==null ||head.next==null)
    return true; 
ListNode temp=head;
int count=0,i=0;
while(temp!=null){
    count++;
    temp=temp.next;
}
ListNode mid=head;
while(i<count/2){
    i++;
   mid=mid.next;
}
ListNode last=reverse(mid);
ListNode cur=head;
while(last!=null){
    if(last.val!=cur.val){
    return false;}
    last=last.next;
    cur=cur.next;
}
return true;
}
    
    public static ListNode reverse(ListNode head){
    if(head==null ||head.next==null)
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

