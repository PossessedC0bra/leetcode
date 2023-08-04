# 2. Add Two Numbers

```java copy showLineNumbers filename="Solution.java"
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
        ListNode root = new ListNode();

        ListNode currentRes = root;
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        while (currentL1 != null || currentL2 != null) {
            if (currentRes.next == null) {
                currentRes.next = new ListNode();
            }
            currentRes = currentRes.next;

            if (currentL1 != null) {
                currentRes.val += currentL1.val;
                currentL1 = currentL1.next;
            }
            if (currentL2 != null) {
                currentRes.val += currentL2.val;
                currentL2 = currentL2.next;
            }

            if (currentRes.val >= 10) {
                int carry = currentRes.val / 10;
                currentRes.val -= carry * 10;
                currentRes.next = new ListNode(carry);
            }
        }

        return root.next;
    }
}
```