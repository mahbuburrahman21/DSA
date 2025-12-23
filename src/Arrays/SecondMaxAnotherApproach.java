package Arrays;

//find the second max element in the array.
public class SecondMaxAnotherApproach {
    static void main(String[] args) {
        //int[] arr = {10,20,30,90,50,60};
        int[] arr = {4,10,10,6,3,8};
        int secondMaxNumber = secondMax(arr);
        System.out.println(secondMaxNumber);
    }
    public static int secondMax(int[] arr){
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        //calculate first max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) firstMax = arr[i];
        }
        //calculate second max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondMax && arr[i] != firstMax) secondMax = arr[i];
        }
        return secondMax;
    }
}
