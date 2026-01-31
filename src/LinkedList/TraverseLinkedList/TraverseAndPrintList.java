package LinkedList.TraverseLinkedList;

public class TraverseAndPrintList {
    private static void display(Node head){
        Node temp = head;
        while (temp.next != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Display Linked List using recursion
    private static void displayRec(Node head){
        if (head.next==null) return;
        System.out.print(head.val+" "); // print left to right
        displayRec(head.next);
        //System.out.print(head.val+" "); // print reverse
    }
    static void main() {
        Node a = new Node(10); //Head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        display(a); // Display full linked list with loop
        displayRec(a); // Display full linked list with recursion
        System.out.println();
        int val =  displaySpecific(a,3); // Display element from specific index
        System.out.println(val);
//        Node n = null;
//        System.out.println(n.val); // Gives null pointer exception
//        System.out.println(n.next); // Gives null pointer exception
    }

    private static int displaySpecific(Node head, int idx) {
        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
}
