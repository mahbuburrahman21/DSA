package Stacks;
import java.util.Stack;

public class BasicSTLOfStacks {
    static void main() {
        Stack<String> st = new Stack<>();
        //st.pop(); //underflow
        st.push("Mahbub");
        st.push("Mahir");
        st.push("Mim");
        st.push("Mohammad");
        st.push("Meghla");
        System.out.println(st.size());
        System.out.println(st); // A. S. = O(n)
        st.pop();
        System.out.println(st.size());
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        String s = st.peek();
    }
}
