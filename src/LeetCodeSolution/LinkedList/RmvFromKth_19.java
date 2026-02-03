package LeetCodeSolution.LinkedList;

public class RmvFromKth_19 extends Operations{
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Edge case: single node
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Move fast n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move together
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete node
        slow.next = slow.next.next;

        return head;
    }
}