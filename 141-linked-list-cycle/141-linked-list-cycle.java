/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;
      
        while(s!=null&&f!=null){
            if(f.next==null){
                return false;
            }else{
            f=f.next;}
            if(s==f){
                return true;
            }
          s=s.next;
          f=f.next;
        }
        return false;
       
    }
}