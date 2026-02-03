package LeetCodeSolution.LinkedList;

public class MiddleOfTheLL_876 extends Operations {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode middleNode_apr2(ListNode head) {
        if (head.next == null) return head;
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        ListNode t = head;
        for (int i = 1; i < ((count/2)+1); i++) {
            t = t.next;
        }
        return t;
    }
}
