package LeetCodeSolution;

public class ArrangingCoins_441 {
    static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }
    public static int arrangeCoins(int n) {
        // n could be a large number. So cast it to long type with a different variable(m).
        return (sqrt(1+8* (long) n)-1)/2;
    }


    public static int sqrt(long x) {
        if(x==0) return 0;
        long start = 1;
        long end = x;
        long root = -1;
        while (start <= end){
            long mid = start+(end-start)/2;

            if (mid > x/mid) end = mid-1;
            else {
                start = mid+1;
                root = mid;
            }
        }
        return (int)root;
    }
}
