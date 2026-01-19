package Recursion;

public class SumOf1ToNNumbers {
    static void main(String[] args) {
        int n = 384349347;
        System.out.println(sum(100));
    }
    public static int sum(int n){
        if (n==0) return 0;
        return n + sum(n-1);
    }
}
