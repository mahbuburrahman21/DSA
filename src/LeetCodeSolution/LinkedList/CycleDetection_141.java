package LeetCodeSolution.LinkedList;

public class CycleDetection_141 extends Operations{
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next==null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null && fast.next.next != null){
            slow = slow.next; // x speed
            fast = fast.next.next; // 2x speed
            if(fast == slow) return true;
        }
        return false;
    }
}
