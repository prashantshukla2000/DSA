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
    public ListNode mergeKLists(ListNode[] lists) {
if (lists == null || lists.length == 0) {
    return null;
  }
      for (int i = 1; i < lists.length; ++i) {
      lists[0] = mergeTwoLists(lists[0], lists[i]);
  }

  return lists[0];
        }
    
      public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l=new ListNode(0);
        ListNode l3=l;
    
        while(l1!=null && l2 !=null){
            if(l1.val<=l2.val){
                l3.next=l1;
                l1=l1.next;
            }else{
                 l3.next=l2;
                 l2=l2.next;
            }
            l3=l3.next;
        }
    if (l1 != null) {
            l3.next = l1;
        }
          else if (l2 != null) {
            l3.next = l2;
        }
        return l.next;
    }

}