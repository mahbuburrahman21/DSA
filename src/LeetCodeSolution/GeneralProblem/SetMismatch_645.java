package LeetCodeSolution.GeneralProblem;

public class SetMismatch_645 {
    static void main() {

    }
    public int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int i = 0;
        int n = arr.length;
        while (i < n) {
            int rightIdx = arr[i] - 1;
            if (arr[i] == i + 1 || arr[i] == arr[rightIdx])
                i++;
            else
                swap(i, rightIdx, arr);
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) {
                ans[0] = arr[j];
                ans[1] = j + 1;
            }
        }

        return ans;
    }

    private static void swap(int i, int idx, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
