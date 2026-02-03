package LeetCodeSolution.LinkedList;

public class DeleteMiddleNode_2095 extends Operations{
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow.next != null) {
            slow.val = slow.next.val;
            slow.next = slow.next.next;
        }else {
            head.next = null;
        }
        return head;
    }
}
