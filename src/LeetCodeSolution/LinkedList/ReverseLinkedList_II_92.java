package LeetCodeSolution.LinkedList;

public class ReverseLinkedList_II_92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        // Edge case: empty list OR no need to reverse
        if (head == null || left == right)
            return head;

        // Step 1: Create dummy node to handle edge cases (like left = 1)
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        /*
           We divide the list into 3 parts:

           Part 1: Before "left"
           Part 2: From left to right (to be reversed)
           Part 3: After "right"
        */

        // -------------------------------------------------
        // Find tail of Part 1 (node just before "left")
        // -------------------------------------------------
        ListNode tail1 = dummy;
        for (int i = 1; i < left; i++) {
            tail1 = tail1.next;
        }

        // head2 = starting node of the portion to reverse
        ListNode head2 = tail1.next;

        // -------------------------------------------------
        // Find tail of Part 2 (node at position "right")
        // -------------------------------------------------
        ListNode tail2 = dummy;
        for (int i = 1; i <= right; i++) {
            tail2 = tail2.next;
        }

        // head3 = starting node of Part 3
        ListNode head3 = tail2.next;

        // -------------------------------------------------
        // Break connections temporarily
        // -------------------------------------------------
        tail1.next = null;
        tail2.next = null;

        // Reverse Part 2
        reverseList(head2);

        // -------------------------------------------------
        // Reconnect all three parts
        // -------------------------------------------------
        tail1.next = tail2;   // tail2 becomes new head of reversed portion
        head2.next = head3;   // head2 becomes tail after reversal

        return dummy.next;
    }


    // Standard iterative linked list reversal
    public void reverseList(ListNode head) {

        if (head == null || head.next == null)
            return;

        ListNode current = head;
        ListNode previous = null;
        ListNode forward = null;

        while (current != null) {
            forward = current.next;   // store next
            current.next = previous;  // reverse link
            previous = current;       // move previous
            current = forward;        // move current
        }
    }
}
