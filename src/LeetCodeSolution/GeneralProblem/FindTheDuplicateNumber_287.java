package LeetCodeSolution.GeneralProblem;

public class FindTheDuplicateNumber_287 {
    static void main() {
        int[] arr1 = {1,3,4,2,2};
        int[] arr2 = {3,1,3,4,2};
        int[] arr3 = {3,3,3,3,3};
        System.out.println(findDuplicate(arr1));
        System.out.println(findDuplicate(arr2));
        System.out.println(findDuplicate(arr3));
    }
    public static int findDuplicate(int[] arr) {
        int i=0;
        while (i< arr.length){
            if (arr[i] == i) i++;
            else {
                int idx = arr[i];
                if (arr[i] == arr[idx]) return arr[idx];
                swap(i,idx,arr);
            }
            //int idx = arr[i];

        }
        return 100;
    }
    private static void swap(int i, int idx, int[] arr){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
