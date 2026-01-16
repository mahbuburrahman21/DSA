package Recursion;

public class Print_n_to_1_to_1_to_n {
    static void main() {
        printNum(5);
    }

    // Print -> 5 4 3 2 1 1 2 3 4 5
    public static void printNum(int n){
        if (n==0) return;
        System.out.print(n+" ");
        printNum(n-1);
        System.out.print(n+" ");
    }


    //Method:1 to print one only once
    //Print -> 5 4 3 2 1 2 3 4 5 only once one
//    public static void printNum(int n){
//        if (n==1) {
//            System.out.print(n+" ");
//            return;
//        }
//        System.out.print(n+" ");
//        printNum(n-1);
//        System.out.print(n+" ");
//    }


    //Method:2 to print one only once
    // Print -> 5 4 3 2 1 2 3 4 5 only once one
//    public static void printNum(int n){
//        if (n==0) return;
//        System.out.print(n+" ");
//        printNum(n-1);
//        if (n!=1) System.out.print(n+" ");
//    }

}
