package Recursion;

public class a_RaisedToThePower_b { // a^b
    static void main() {
        System.out.println(a_toThePower_b(2,5));
    }

    // Time Complexity: O(b)
    // Space Complexity: O(b)
//    public static int a_toThePower_b(int a, int b){
//        if (b==1 || b==0) return a;
//        return a*a_toThePower_b(a,b-1);
//    }

    // More Optimized
    // Logarithmic Time Complexity
    //Here we are calling the same function twice. It can cause problem.
//    public static int a_toThePower_b(int a, int b){
//        if (b==1 || b==0) return a;
//        if (b%2 != 0)
//            return a * a_toThePower_b(a,b/2) * a_toThePower_b(a,b/2);
//        else
//            return a_toThePower_b(a,b/2) * a_toThePower_b(a,b/2);
//    }


    // More Optimized
    // Logarithmic Time Complexity
    public static int a_toThePower_b(int a, int b){
        if (b==1 || b==0) return a;
        int call = a_toThePower_b(a,b/2);
        if (b%2 != 0)
            return a * call * call;
        else
            return call * call;
    }
}
