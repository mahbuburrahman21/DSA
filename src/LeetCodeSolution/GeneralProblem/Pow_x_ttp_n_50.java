package LeetCodeSolution.GeneralProblem;

public class Pow_x_ttp_n_50 {
    static void main(String[] args) {
        System.out.println(myPow(2.00,-2));
    }
    public static double myPow(double a, int b) {
        if (b==0) return 1;
        double call = myPow(a,b/2);
        if (b%2 != 0)
            return a * call * call;
        else
            return call * call;
    }
}
