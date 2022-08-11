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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&& list2==null)
            return null;
        if(list1==null)
            return list2;
        else if(list2==null)
            return list1;
       PriorityQueue<ListNode> queue= new PriorityQueue<ListNode>(
            (a,b)->(a.val-b.val));
        queue.add(list1);
        queue.add(list2);
        ListNode head=new ListNode(-1);
        ListNode temp=head;
         if(queue.isEmpty()) {return null;}
        while(!queue.isEmpty()){
            ListNode ele=queue.poll();
            temp.next=ele;
           temp=temp.next;
            if(ele.next!=null){
                queue.add(ele.next);
            }
        }
        return head.next;
    }
}