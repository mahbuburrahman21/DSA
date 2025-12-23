package Arrays;

//find the second max element in the array.
public class SecondMax {
    static void main(String[] args) {
        //int[] arr = {10,20,30,90,50,60};
        int[] arr = {4,10,10,6,3,8};
        int secondMaxNumber = secondMax(arr);
        System.out.println(secondMaxNumber);
    }
    public static int secondMax(int[] arr){
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            if (arr[i]<firstMax && arr[i]>secondMax){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
