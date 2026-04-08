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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
     ListNode slow=head;
     ListNode fast=head;
     //finding mid point
     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
     }
     //reverse the second half
     ListNode second = slow.next;
        slow.next = null;
     ListNode prev=null;
     ListNode current=second;
     while(current!=null){
        ListNode Next=current.next;
        current.next=prev;
        prev=current;
        current=Next;
     }
// Step 3: Merge
        ListNode first = head;
        ListNode secondHalf = prev;

        while (secondHalf != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = secondHalf.next;

            first.next = secondHalf;
            secondHalf.next = temp1;

            first = temp1;
            secondHalf = temp2;
        }

    }
}