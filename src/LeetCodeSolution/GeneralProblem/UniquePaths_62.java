package LeetCodeSolution.GeneralProblem;

public class UniquePaths_62 {
    static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }

    //Recursive Solution
    //Gives Time limit Exceed-------------(TLE)error------------.
    //public static int uniquePaths(int m, int n) {
        //if(m==1 || n==1) return 1;
        //return uniquePaths(m-1, n) + uniquePaths(m, n-1);
    //}


    //Optimized Solution Using Dynamic Programming-----------(DP)------------.
    public static int uniquePaths(int m, int n) {
        if (m==1 || n==1) return 1;
        int[][] dp = new int[m][n];

        for (int i = 0; i < n; i++) { //keep 1 in the first(0th) row
            dp[0][i] = 1;
        }
        for (int i = 0; i < m; i++) { //keep 1 in the first(0th) col
            dp[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
