package LeetCodeSolution.LinkedList;

public class AddTwoNumbers_II_445  extends Operations{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Step 1: Reverse both lists (since digits are forward)
        l1 = reverse(l1);
        l2 = reverse(l2);

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        // Step 2: Add like normal (same as LeetCode 2)
        while (l1 != null || l2 != null || carry != 0) {

            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        // Step 3: Reverse result back
        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }
}
