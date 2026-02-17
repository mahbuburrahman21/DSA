package LeetCodeSolution.LinkedList;

public class AddTwoNumbers_2  extends Operations{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        int carry = 0;

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
            t.next = new ListNode(sum % 10);
            t = t.next;
        }

        return dummy.next;
    }
}
