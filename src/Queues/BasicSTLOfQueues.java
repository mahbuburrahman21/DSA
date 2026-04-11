package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class BasicSTLOfQueues {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q);
        q.remove();
        System.out.println(q);
        System.out.println("size of the queue: "+ q.size());
        System.out.println("peek of the queue: "+ q.peek());
        System.out.println(q.remove());
        System.out.println(q);
    }
}
