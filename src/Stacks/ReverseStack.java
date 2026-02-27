package Stacks;

import java.util.Stack;

public class ReverseStack {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }

    private static void reverseStack(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        reverseStack(st);
        pushAtBtm(st,top);
    }
    private static void pushAtBtm(Stack<Integer> st, int ele) {
        if (st.isEmpty()) {
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBtm(st, ele);
        st.push(top);
    }
}
