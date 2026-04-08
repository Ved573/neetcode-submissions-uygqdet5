/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Create mapping
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;

        while (temp != null) {
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }

        // Step 2: Assign next and random
        temp = head;
        while (temp != null) {
            Node copyNode = map.get(temp);

            copyNode.next = map.get(temp.next);      // next pointer
            copyNode.random = map.get(temp.random);  // random pointer

            temp = temp.next;
        }

        // Step 3: Return new head
        return map.get(head);
    }
}
