package LeetCodeSolution.LinkedList;

public class ReorderList_143 extends Operations{
    public void reorderList(ListNode head) {
        if(head.next == null) return;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode second = slow.next;
        slow.next = null; //break the LL

        //Start reverse
        ListNode p = null; // p -> previous
        ListNode f = null; // f -> forward
        while(second != null){
            f = second.next; // here, c -> current -> second
            second.next = p;
            p = second;
            second = f;
        }

        ListNode first = head;
        second = p; // previous is new head.

        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
