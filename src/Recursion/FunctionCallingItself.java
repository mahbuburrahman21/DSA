package Recursion;

public class FunctionCallingItself {
    static void main(String[] args) {
        mahbub(15);
    }

    public static void mahbub(int n){
        System.out.println("Maisha");
        if (n == 10) return;
        mahbub(n+1);
    }
}
