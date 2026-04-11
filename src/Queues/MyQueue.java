package Queues;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

public class MyQueue {
    Node head;
    Node tail;
    int size;
    int peek(){
        if (size == 0){
            throw new NullPointerException("Queue is empty!");
        }
        return head.val;
    }
    int remove(){
        if (size == 0){
            throw new NullPointerException("Queue is empty!");
        }
        int front = head.val;
        head = head.next;
        size--;
        return front;
    }
    void add(int val){
        Node temp = new Node(val);
        if(size == 0) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
