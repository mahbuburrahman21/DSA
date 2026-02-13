package LeetCodeSolution.LinkedList;

public class FirstNodeOfCycle_142 extends Operations{
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode slow = head, fast = head;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find entry point
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public void removeCycle(ListNode head) {
        if (head == null || head.next == null)
            return;

        ListNode slow = head, fast = head;
        ListNode mark = fast;

        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find entry point
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    mark = fast;
                    fast = fast.next;
                }
            }
        }
        mark.next = null;
    }
}
