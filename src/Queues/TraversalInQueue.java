package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TraversalInQueue {
    static void main() {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
        addAtIdx(q, 60, 3);
        addAtIdx(q, 90, 7);
        display(q);
        System.out.println(peekAtIdx(q, 5));
        System.out.println(peekAtIdx(q, 3));
        reverse(q);
        display(q);
        reverseKElement(q,3);
        reverseKElement(q,2);
        removeAtIdx(q,2);
        removeAtIdx(q,3);
        display(q);
    }

    // Add a new element at any specific index
    private static void addAtIdx(Queue<Integer> q, int val, int idx) {
        int n = q.size();
        if(idx>n || idx<0){
            System.out.println("Invalid index!");
            return;
        } else if (idx==n) {
            q.add(val);
            return;
        }

        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        q.add(val);
        for (int i = 0; i < n-idx; i++) {
            q.add(q.remove());
        }
    }

    // peek element at any specific index
    private static int peekAtIdx(Queue<Integer> q, int idx) {
        int n = q.size();

        // cleaner condition
        if (idx < 0 || idx >= n) {
            throw new IllegalArgumentException("Invalid index");
        }

        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }

        Integer val = q.peek();

        if (val == null) { // safety check
            throw new IllegalStateException("Queue contains null");
        }

        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }

        return val;
    }

    // remove element at any specific index
    private static void removeAtIdx(Queue<Integer> q, int idx) {
        int n = q.size();

        // cleaner condition
        if (idx < 0 || idx >= n) {
            throw new IllegalArgumentException("Invalid index");
        }

        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        q.remove();
        for (int i = 0; i < n-1 - idx; i++) {
            q.add(q.remove());
        }
    }

    //Display the queue
    private static void display(Queue<Integer> q){
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek()+" ");
            q.add(q.remove());
        }
        System.out.println();
    }

    //Reverse first all element in a queue
    private static void reverse(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        //Add all element of Queue in a Stack
        while (!q.isEmpty()){
            st.push(q.remove());
        }
        //Now add all element of Stack back in queue
        while (!st.isEmpty()){
            q.add(st.pop());
        }
    }

    //Reverse first k element in a queue
    private static void reverseKElement(Queue<Integer> q, int k){
        int n = q.size();
        Stack<Integer> st = new Stack<>();
        //Add k element of Queue in a Stack
        for (int i = 0; i < k; i++) {
            st.push(q.remove());
        }
        //Now add all element of Stack back in queue
        while (!st.isEmpty()){
            q.add(st.pop());
        }
        // remove and add front elements to the rear to keep the queue perfect
        for (int i = 0; i < n-k; i++) {
            q.add(q.remove());
        }
    }
}
