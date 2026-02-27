static class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

static class MyStack {
    int len;
    Node head;

    void push(int ele){
        Node newNode = new Node(ele);
        newNode.next = head;
        head = newNode;
        len++;
    }

    int pop() throws Exception{
        if (head == null) throw new EmptyStackException();
        int top = head.val;
        head = head.next;
        len--;
        return top;
    }

    int peek() throws Exception{
        if (head == null) throw new EmptyStackException();
        return head.val;
    }

    int size(){
        return len;
    }

    void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}

void main() throws Exception{
    MyStack st = new MyStack();
    //st.pop();
    st.push(10);
    st.push(20);
    st.push(30);
    st.push(40);
    st.push(50);
    st.push(60);
    st.display();
    //st.pop();
    System.out.println("popped element -> "+st.pop()+"\n");
    st.display();

}
