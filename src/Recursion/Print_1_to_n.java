package Recursion;

public class Print_1_to_n {
    static void main(String[] args) {
        printNum(5);
    }

    // method 1
//    public static void printNum(int x, int n){
//        if (x>n) return;
//        System.out.println(x);
//        printNum(x+1, n);
//    }
    public static void printNum(int n){
        if (n==0) return;
        printNum(n-1);
        System.out.println(n);
    }
}
