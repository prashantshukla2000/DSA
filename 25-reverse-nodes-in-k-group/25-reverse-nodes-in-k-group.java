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
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode dummy=new ListNode(0,head);
        ListNode groupPrev=dummy; //the element present before the group
        
        while(true){
            ListNode kth =getkth(groupPrev,k);//we get the elemnet at kth position
            if(kth==null) //if at last kth will be null if leass than k val present
                break;
            ListNode groupNext=kth.next;//element present after every group
            //now we reverse the group using two pointer
            ListNode prev=kth.next;//we only want one listlist so it will be added
            ListNode curr=groupPrev.next;//the first node
            while(curr!=groupNext) //since groupnext is the end of the group
            {
            ListNode temp=curr.next;
             curr.next=prev;//add the first ele to ele after the group 
             prev=curr;       //move forward
             curr=temp;
                
            }   
            ListNode tempo=groupPrev.next;//to set new groupprev value
            groupPrev.next=kth;//add the kth to the beginning of the list since group is rever
            groupPrev=tempo;
            
        }
        return dummy.next;
    }
    public ListNode getkth(ListNode curr, int k){
        while(curr!=null &&k>0){
            k=k-1;
            curr=curr.next;
        }
        return curr;
    }
}