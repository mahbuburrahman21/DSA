package LinkedList.LLDS;

public class LinkedListDataStructure {
    static void main() {
        LinkedLists ll = new LinkedLists();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtTail(50);
        ll.addAtTail(60);
        ll.display();
        ll.insert(0,55);
        ll.display();
        ll.insert(7,66);
        ll.display();
        ll.insert(1,100);
        ll.display();
        ll.insert(15,100);
        ll.display();
        ll.delete(1);
        ll.display();
        ll.delete(7);
        ll.display();
    }
}



