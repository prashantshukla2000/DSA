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
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null)
            return head;
        ListNode small=new ListNode();
        ListNode s=small;
        ListNode big =new ListNode();
        ListNode b=big;
        ListNode temp=head;
        while(temp!=null ){
            if(temp.val<x){
                ListNode ele=new ListNode(temp.val);
                small.next=ele;
                small=small.next;
            }else{
                 ListNode ele=new ListNode(temp.val);
                big.next=ele;
                big=big.next;
            }
            temp=temp.next;
        }
        b=b.next;
        small.next=b;
        
        return s.next;
    }
}