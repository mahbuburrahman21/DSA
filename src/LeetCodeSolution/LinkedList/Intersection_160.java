package LeetCodeSolution.LinkedList;

public class Intersection_160 extends Operations{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode temp1 = headA, temp2 = headB;
        int sizeA = 0, sizeB = 0;

        while (temp1 != null) {
            sizeA++;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            sizeB++;
            temp2 = temp2.next;
        }

        ListNode fast = headA;
        ListNode slow = headB;

        if (sizeB > sizeA) {
            fast = headB;
            slow = headA;
        }

        int diff = Math.abs(sizeA - sizeB); // difference of two Linked List
        for (int i = 0; i < diff; i++) {
            fast = fast.next;
        }

        while (fast != null && slow != null) {
            if (fast == slow)
                return fast;
            fast = fast.next;
            slow = slow.next;
        }
        return null;
    }
}
