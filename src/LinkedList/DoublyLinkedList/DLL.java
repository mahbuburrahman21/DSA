package LinkedList.DoublyLinkedList;
// DLL -> Doubly Linked List
public class DLL {
    ListNode head;
    ListNode tail;
    int size;
    ListNode getHead(){
        return head;
    }
    ListNode getTail(){
        return tail;
    }
    void addAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null){
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
        ListNode temp = new ListNode(val);
        if(tail == null){
            head = temp;
            tail = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if (head == null) return;
        else if( head.next == null) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteAtTail(){
        if (tail == null) return;
        else if( tail.prev == null) {
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    void display(){
        ListNode temp = head;
        while (temp != null){
            if (temp.next == null) System.out.println(temp.val);
            else System.out.print(temp.val+" <--> ");
            temp = temp.next;
        }
        System.out.println();
    }
    void display(ListNode head){
        ListNode temp = head;
        while (temp != null){
            if (temp.next == null) System.out.println(temp.val);
            else System.out.print(temp.val+" <--> ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayRev(){
        ListNode temp = tail;
        while (temp != null){
            if (temp.prev == null) System.out.println(temp.val);
            else System.out.print(temp.val+" <--> ");
            temp = temp.prev;
        }
        System.out.println();
    }
    void insert(int idx, int val){
        if(idx < 0 || idx > size) System.out.println("Wrong idx");
        else if(idx == 0) addAtHead(val);
        else if (idx == size) addAtTail(val);
        else {
            ListNode temp = new ListNode(val);
            ListNode left = head;
            for (int i = 1; i < idx; i++) {
                left = left.next;
            }
            ListNode right = left.next;
            left.next = temp;
            temp.prev = left;
            temp.next = right;
            right.prev = temp;
        }
        size++;
    }
    void delete(int idx){
        if(idx < 0 || idx > size-1) System.out.println("Wrong idx");
        else if(idx == 0) deleteAtHead();
        else if(idx == size-1) deleteAtTail();
        else {
            ListNode left = head;
            for (int i = 1; i < idx; i++) { // 2 < 3
                left = left.next;
            }
            ListNode right = left.next.next;
            left.next = right;
            right.prev = left;
        }
        size--;
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head; // c -> current
        ListNode left = null; // p -> previous
        ListNode fwd; // f -> forward
        while(curr != null){
            fwd = curr.next;
            curr.next = left;
            curr.prev = fwd; // ****New Added for DLL****
            left = curr;
            curr = fwd;
        }
        return left;
    }
    public ListNode reverseListApr2(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode curr = head; // c -> current
        ListNode temp = null; // p -> previous
        while(curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
    }
}
