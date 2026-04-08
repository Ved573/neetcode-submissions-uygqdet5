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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int size = 0;
        ListNode temp = head;

        // Step 1: Find size
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // Step 2: If head needs to be removed
        if (size == n) {
            return head.next;
        }

        // Step 3: Go to node before target
        int steps = size - n;
        temp = head;

        for (int i = 1; i < steps; i++) {
            temp = temp.next;
        }

        // Step 4: Remove node
        temp.next = temp.next.next;

        return head;
    }
}
