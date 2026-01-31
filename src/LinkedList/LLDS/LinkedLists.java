package LinkedList.LLDS;

public class LinkedLists { // User defined Data Structure
    Node head;
    Node tail;
    int size; // This variable will trace the size of the Linked-List
    void addAtTail(int val){
        Node temp = new Node(val);
        if (tail==null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if (head==null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deleteHead(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head==null) tail = null;
        size--;
    }
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Size of the Linked-List: "+size);
        System.out.println();
    }
    boolean searchIsFound(int val){
        if (head==null) return false;
        Node temp = head;
        while (temp != null){
            if (temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }
    int searchIdx(int val){
        if (head==null) return -1;
        Node temp = head;
        int idx = 0;
        while (temp != null){
            if (temp.val == val) return idx;
            temp = temp.next;
            idx++;
        }
        return -1;
    }
    void insert(int idx, int val){
        if (idx>size || idx<0) {
            System.out.println("Wrong index");
            return;
        }
        if (idx == 0) addAtHead(val);
        else if (idx == size) addAtTail(val);
        else {
            Node temp = head;
            for (int i = 0; i < idx-1; i++) {
                temp = temp.next;
            }
            Node t = new Node(val);
            t.next = temp.next;
            temp.next = t;
            size++;
        }
    }
    int get(int idx){
        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void delete(int idx){
        if (idx < 0 || idx >= size){
            System.out.println("Wrong index!");
            return;
        }
        if (idx == 0) {
            deleteHead();
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (idx == size-1) tail = temp; //We are deleting tail
        size--;
    }



}



