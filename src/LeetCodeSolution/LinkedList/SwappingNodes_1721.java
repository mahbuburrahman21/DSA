package LeetCodeSolution.LinkedList;

public class SwappingNodes_1721 extends Operations{
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        for(int i=1; i<k; i++){
            fast = fast.next;
        }
        ListNode mark = fast;
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        //Swap
        int temp = mark.val;
        mark.val = slow.val;
        slow.val = temp;

        return head;
    }
}
