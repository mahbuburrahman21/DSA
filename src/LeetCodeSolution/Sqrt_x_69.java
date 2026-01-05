package LeetCodeSolution;

public class Sqrt_x_69 {
    static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int root = -1;
        while (start <= end){
            int mid = start+(end-start)/2;
            if ((long)mid*mid > x) end = mid-1;
            else {
                start = mid+1;
                root = mid;
            }
        }
        return root;
    }
}
