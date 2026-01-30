package LinkedList.CreateLinkedList;

class Node{
    int val; //Default value = 0
    Node next; //Default value = null
    Node(int val){
        this.val = val;
    }
}

public class NodeOfLinkedList {
    static void main(String[] args) {
        //Create Linked-List for this -> 10 20 30 40 50
        //Node created
        Node a = new Node(10); //Head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        //Node Linking
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println("a value -> "+a);
        System.out.println("b address -> "+a.next);
        System.out.println("b value -> "+b);
        System.out.println("c address -> "+b.next);
        System.out.println("c value -> "+c);
        System.out.println("d address -> "+c.next);
        System.out.println("d value -> "+d);
        System.out.println("e address -> "+d.next);
        System.out.println("e value -> "+e);
        System.out.println("last node address -> "+e.next);

        System.out.println(a.next.next.next.val); //40
    }
}
