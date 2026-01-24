package Recursion;

public class TowerOfHanoi {
    static void main() {
        hanoi(8,'A','B','C');
    }

    private static void hanoi(int n, char a, char b, char c) {
        if (n==0)return;
        hanoi(n-1,a,c,b); // n-1 disks from A to B via C
        System.out.println(a+"->"+c);
        hanoi(n-1,b,a,c); // n-1 disks from B to C via A
    }
}
