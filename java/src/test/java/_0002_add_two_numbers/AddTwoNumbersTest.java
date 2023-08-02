package _0002_add_two_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoNumbersTest {
    private Solution solution;

    @BeforeEach
    public void beforeEach() {
        solution = new Solution();
    }

    @Test
    public void case1() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void case2() {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        ListNode expected = new ListNode(0);

        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    public void case3() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }
}
