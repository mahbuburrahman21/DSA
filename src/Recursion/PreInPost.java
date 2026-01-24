package Recursion;

public class PreInPost {
    static void main(String[] args) {
        pip(3);
    }
    public static void pip(int n){
        if (n==0) return;
        System.out.print(n+" "); //pre
        pip(n-1);
        System.out.print(n+" "); // in
        pip(n-1);
        System.out.print(n+" "); //post
    }
    //answer of pip(1) --> 1 1 1
    //answer of pip(2) --> 2 1 1 1 2 1 1 1 2
    //answer of pip(3) --> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
}

