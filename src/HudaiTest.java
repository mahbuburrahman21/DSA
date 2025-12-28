void main() {
    //int[] arr = {1,2,7,3,5,6,1,8,4,9};
    int[] arr = {3,2,4};
    //Arrays.sort(arr); //{ 1,1,2,3,4,5,6,7,8,9 }
    //System.out.println(Arrays.toString(arr));
    int target = 6;
    System.out.println(Arrays.toString(twoSum(arr, target)));

}
//public static int[] twoSum(int[] num, int target) {
//    int n = num.length;
//    int[] arr = new int[2];
//    for(int i = 0; i<n; i++){
//        for(int j = i+1; j<n; j++){
//            if((num[i]+num[j]== target)){
//                arr[0] = i;
//                arr[1] = j;
//                return arr;
//            }
//        }
//    }
//    return arr;
//}
public static int[] twoSum(int[] num, int target) {
    int n = num.length;
    int[] arr = new int[2];
    //Arrays.sort(num);
    int i=0;
    int j = n-1;
    while (i<j){
        System.out.printf("i -> %d\nj -> %d\nsum of i and j index = %d\n\n", i,j,num[i]+num[j]);
        if (num[i]+num[j] == target){
            arr[0] = i;
            arr[1] = j;
            return arr;
        }
        if (num[i]+num[j]>target){
            j--;
        } else i++;
    }
    return null;
}
