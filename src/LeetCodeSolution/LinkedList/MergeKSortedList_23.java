package LeetCodeSolution.LinkedList;

public class MergeKSortedList_23 extends Operations{
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        int len = lists.length;

        while (len > 1) {
            // Merge outer pairs: (0, last), (1, last-1), etc.
            for (int i = 0; i < len / 2; i++) {
                lists[i] = merge(lists[i], lists[len - 1 - i]);
            }
            // Halve the effective length (keeping the middle element if odd)
            len = (len + 1) / 2;
        }

        return lists[0];
    }

    public ListNode merge(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (head1 != null && head2 != null) {
            if (head1.val <= head2.val) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        temp.next = (head1 == null) ? head2 : head1;
        return dummy.next;
    }
}
