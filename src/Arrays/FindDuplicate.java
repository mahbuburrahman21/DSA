package Arrays;

public class FindDuplicate {
    static void main(String[] args) {
        //int[] arr = {2,3,1,3,3,5,5,5,5,4,4,5};
        int[] arr = {2,3,1,3,3,5,5,5,5,4,4,5,2,32,2,5,6,8,8,7,2};
        //int[] arr = {2,3,1,3,3,5,5};
        int duplicate = findDuplicate(arr);
        System.out.println(duplicate);
    }
    public static int findDuplicate(int[] arr){
        int n = arr.length;
        int i=0;
        int j=1;
        int duplicate = 0;
        int ignore = Integer.MIN_VALUE;
        while (j < n && i < n-1){
            System.out.printf("i->%d\nj->%d\n",i,j);
            System.out.println();
            if (arr[i] == arr[j] && arr[i] != ignore) {
                duplicate++;
                ignore = arr[i];
                System.out.println("Duplicate element: "+arr[i]);
                System.out.println();
            }
            if (j == n-1){
                i++;
                j=i+1;
            } else j++;
        }
        if (duplicate == 0) return -1;
        else return duplicate;
    }
}

