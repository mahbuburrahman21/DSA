package LeetCodeSolution.GeneralProblem;

public class FirstMissingPositive_41 {
    static void main() {

    }
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int val = arr[i];
            int correctIdx = val - 1;

            if (val <= 0 || val > n || arr[i] == arr[correctIdx]) {
                i++;
            } else {
                swap(arr, i, correctIdx);
            }
        }

        for (int j = 0; j < n; j++) {
            if (arr[j] != j + 1) return j + 1;
        }
        return n + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
