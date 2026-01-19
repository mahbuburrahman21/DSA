package Recursion;

public class GreatestCommonDivisor_GCD {
    static void main(String[] args) {
        int a = 13;
        int b = 41;
        int gcd = 0;
        for (int i = 1; i <= Math.min(a,b); i++) {
            if (a % i == 0 && b % i == 0) gcd = i;
            //System.out.println(gcd);
        }
        System.out.println("GCD by for -->"+gcd);
        System.out.println("GCD inefficient--> "+gcd(a,b,0,1));
        System.out.println("GCD efficient--> "+hcf(a,b));
    }

    // Inefficient code T.C. = O(a)
    public static int gcd(int a, int b, int gcd,int i){
        if (i > a) return gcd;
        if (a % i == 0 && b % i == 0) gcd = i;
        return gcd(a,b,gcd,i+1);
    }

    // Optimized code
    public static int hcf(int a, int b){ // gcd and hcf is the same thing
        //if (b%a == 0) return a;
        if (a == 0) return b;
        return hcf(b%a,a);
    }
}
