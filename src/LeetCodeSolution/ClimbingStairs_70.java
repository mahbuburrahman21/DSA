package LeetCodeSolution;

public class ClimbingStairs_70 {
    static void main() {
        System.out.println(climbStairs(40));
    }
    public static int climbStairs(int n) { // Gives Time limit exceed (TLE) error.
        if(n==1) return 1;
        if(n==2) return 2;
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
