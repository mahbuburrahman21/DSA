package Recursion;

public class PrintArrayUsingRecursion {
    static void main() {
        int[] arr = {2,34,6,8,54,21,9,53};

        recPrintFirstToLast(arr,0);
        System.out.println();
        recPrintLastToFirstRev(arr, 0);
        System.out.println();
        recPrintLastToFirst(arr, arr.length-1);
    }

    //Print First to Last
    public static void recPrintFirstToLast(int[] arr, int idx){
        if (idx == arr.length) return;
        System.out.print(arr[idx]+"  ");
        recPrintFirstToLast(arr,idx+1);
    }

    //Print Last to First
    public static void recPrintLastToFirstRev(int[] arr, int idx){
        if (idx == arr.length) return;
        recPrintLastToFirstRev(arr,idx+1);
        System.out.print(arr[idx]+"  ");
    }

    //Print Last to First
    public static void recPrintLastToFirst(int[] arr, int idx){
        if (idx < 0) return;
        System.out.print(arr[idx]+"  ");
        recPrintLastToFirst(arr,idx-1);
    }
}
