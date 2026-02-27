package LinkedList.DoublyLinkedList;

public class Main {
    static void main() {
        DLL list = new DLL();
        list.addAtTail(10);
        list.addAtTail(20);
        list.addAtTail(30);
        list.addAtTail(40);
        list.addAtTail(50);
        list.display();
        list.delete(5);
        list.display();
        ListNode newHead =  list.reverseList(list.getHead());
        list.display(newHead);
    }
}
