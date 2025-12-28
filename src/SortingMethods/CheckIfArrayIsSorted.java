package SortingMethods;

public class CheckIfArrayIsSorted {
    static void main(String[] args) {
        //make array and call to check sorted or not.
    }
    public static boolean isSorted(int[] arr) {
        // Two pointer technique
        int n = arr.length;
        int i=0;
        int j=i+1;
        while(j<n){
            if(arr[i]<arr[j] || arr[i]==arr[j]){
                i++;
                j++;
            } else {
                return false;
            }
        }
        //another way to check array sorted or not.
        // for(int i = 0; i<arr.length-1; i++){
        //     if(arr[i]>arr[i+1]) return false;
        // }
        return true;
    }
}
