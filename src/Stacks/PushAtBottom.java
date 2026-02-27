package Stacks;

import java.util.Stack;

public class PushAtBottom {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        pushBtm(st,50);
    }

    private static void pushBtm(Stack<Integer> st, int ele) {
        if (st.isEmpty()) {
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushBtm(st, ele);
        st.push(top);
    }
}
