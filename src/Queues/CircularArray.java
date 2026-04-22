package Queues;

class CircularQueue{
    private final int[] arr;
    private int f;
    private int r;
    private int size;
    CircularQueue(int capacity){
        arr = new int[capacity];
    }

    void add(int val){
        if (size== arr.length){
            System.out.println("Queue is Full");
            return;
        }
        arr[r++] = val;
        if (r== arr.length) r = 0;
        size++;
    }

    int remove(){
        if (size==0){
            throw new ArrayIndexOutOfBoundsException("Empty Array");
        }
        int value = arr[f];
        f++;
        if(f== arr.length) f=0;
        size--;
        return value;
    }

    int peek(){
        if (size==0){
            throw new ArrayIndexOutOfBoundsException("Empty Array");
        }
        return arr[f];
    }

    void display(){
        if (size==0) return;
        if (f>=r){
            for (int i = f; i < arr.length; i++) { // front to end
                System.out.print(arr[i]+" ");
            }
            for (int i = 0; i < r; i++) { // start to rear-1
                System.out.print(arr[i]+" ");
            }
        }
        else {
            for (int i = f; i < r; i++) { // start to rear-1
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
    void displayArray(){
        for (int j : arr) { // start to rear-1
            System.out.print(j + " ");
        }
    }
}

public class CircularArray {
    static void main() {
        CircularQueue q = new CircularQueue(4);
        q.add(10); q.add(20); q.add(30);
        q.display();
        System.out.println(q.remove());
        q.display();
        q.add(40); q.add(50);
        q.display();
        q.displayArray();


        CircularQueue q2 = new CircularQueue(5);
        q2.add(10); q2.add(20); q2.add(30); q2.add(40); q2.add(50);
        System.out.println(q2.peek());
    }
}
