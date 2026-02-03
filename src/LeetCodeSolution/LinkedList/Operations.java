package LeetCodeSolution.LinkedList;

public class Operations {
    ListNode head;
    ListNode tail;
    int size = 0;
    void addAtTail(int val){
        ListNode temp = new ListNode(val);
        if (tail == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;

            if (temp == null) System.out.print("null");
        }
        System.out.println();
    }
    void display(ListNode newHead){
        ListNode temp = newHead;
        while (temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
            if (temp == null) System.out.print("null");
        }
        System.out.println();
    }
    ListNode getHead(){
        return head;
    }
    static ListNode buildList(Operations ops, int... values) {
        for (int val : values) {
            ops.addAtTail(val);
        }
        return ops.getHead();
    }

}
