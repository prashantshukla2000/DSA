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
      if(l1==null)
          return l2;
        else if(l2==null)
            return l1;
        //making the size same or both list
        ListNode p1=l1;
        ListNode p2=l2;
        while(p1!=null||p2!=null){
            if(p1!=null){
                p1=p1.next;}
            else{
                ListNode n=new ListNode(0);
                n.next=l1;
                l1=n;
            }
                if(p2!=null){
                p2=p2.next;}
            else{
                ListNode n=new ListNode(0);
                n.next=l2;
                l2=n;
            }
        }
        //program intillization
        boolean any_l2=true;
        
        while(any_l2){
          any_l2=false;
        ListNode l1_p=l1;
        ListNode l2_p=l2;
        ListNode prev=null;
                                      //program logic
        while(l1_p!=null){
          int k=(l1_p.val+l2_p.val);
            l1_p.val=k%10;
            l2_p.val=k/10;
            prev=l2_p;
            if(l2_p.val!=0){
                any_l2=true;
            }
            
            l1_p=l1_p.next;
            l2_p=l2_p.next;
        }
        
        prev.next=new ListNode(0);
        if(l2.val==1){
            ListNode n=new ListNode(0);
            n.next=l1;
            l1=n;
        }
        else{
            l2=l2.next;
        }
        }
       return l1; 
    }
}