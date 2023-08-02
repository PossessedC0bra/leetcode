package _0002_add_two_numbers;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /* ********************************************************************** */
    // CUSTOM METHODS
    /* ********************************************************************** */

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder().append("[").append(val);

        ListNode current = next;
        while (current != null) {
            sb.append(",").append(current.val);

            current = current.next;
        }

        return sb.append("]").toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ListNode other) {

            if (val != other.val) {
                return false;
            }

            if (next == null && other.next == null) {
                return true;
            }

            if (next == null || other.next == null) {
                return false;
            }

            return next.equals(other.next);
        }

        return false;
    }
}