package Arrays;

public class MaxElementInArray {
    static void main(String[] args) {
        int[] arr = {12,-12,35,75,1,7,90,43,67,99,15,10,-1};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
