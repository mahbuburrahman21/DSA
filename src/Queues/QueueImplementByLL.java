package Queues;

public class QueueImplementByLL {
    static void main() {
        MyQueue q = new MyQueue();
        q.add(10); q.add(20); q.add(30); q.add(40); q.add(50);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.remove());
        q.display();
        System.out.println(q.size);

    }
}
