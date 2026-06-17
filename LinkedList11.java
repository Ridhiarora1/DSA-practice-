import java.util.*;

class Node {
    int val;
    Node next;
    Node prev;
    Node child;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
        this.child = null;
    }
}

class Solution {

    public Node flatten(Node head) {
        if (head == null) return null;

        dfs(head);
        return head;
    }

    private Node dfs(Node head) {

        Node curr = head;
        Node last = null;

        while (curr != null) {

            Node next = curr.next;

            if (curr.child == null) {
                last = curr;

            } else {

                Node childLast = dfs(curr.child);

                curr.next = curr.child;
                curr.child.prev = curr;

                if (next != null) {
                    childLast.next = next;
                    next.prev = childLast;
                }

                curr.child = null;
                last = childLast;
            }

            curr = next;
        }

        return last;
    }
}