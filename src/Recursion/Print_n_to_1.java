package Recursion;

public class Print_n_to_1 {
    static void main(String[] args) {
        printNum(5);
    }
    public static void printNum(int n){
        if (n==0) return;
        System.out.println(n);

        printNum(n-1);
    }
}
