package Recursion;

public class LinearSearchWithRecursion {
    static void main(String[] args) {
        int[] arr = {2,34,6,8,54,21,9,53};
        boolean check = isFound(arr,0, 55);
        if (check) System.out.println("Element found!");
        else System.out.println("Not found!");
    }

    public static boolean isFound(int[] arr, int idx, int target){
        if (idx== arr.length) return false;
        if (arr[idx] == target) return true;
        return isFound(arr,idx+1,target);
    }
}
