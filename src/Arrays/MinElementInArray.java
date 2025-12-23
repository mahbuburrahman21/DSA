package Arrays;

public class MinElementInArray {
    static void main(String[] args) {
        int[] arr = {12,-12,35,75,1,7,90,43,67,99,15,10,-1};
        int min = arr[0];
        for (int j : arr) {
            if (min > j) {
                min = j;
            }
        }
        System.out.println(min);

    }
}
