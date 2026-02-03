package LeetCodeSolution.GeneralProblem;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    static void main(String[] args) {
        int[] num = {2,7,11,15};
        int target = 9;
        int[] arr = twoSum(num, target);
        int[] arr2 = twoSumOpt(num, target);
        int[] arr3 = twoSumMOpt(num, target);

        System.out.printf("[%d,%d]",arr[0],arr[1]);
        System.out.println();
        System.out.printf("[%d,%d]",arr2[0],arr2[1]);
        System.out.println();
        System.out.printf("[%d,%d]",arr3[0],arr3[1]);

    }
    public static int[] twoSum(int[] num, int target) {
        int n = num.length;
        int[] arr = new int[2];
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if((num[i]+num[j]== target)){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return null;
    }

    //optimized one
    public static int[] twoSumOpt(int[] num, int target) {

        for(int i = 1 ; i < num.length; i++){
            for(int j = 0 ; j <  num.length - i; j++){
                if(num[j] + num[j+i] == target)
                {
                    return new int[]{j,j + i};
                }
            }
        }
        return new int[]{};
    }
    //more optimized one
    //Time: O(n)
    //Space: O(n)
    public static int[] twoSumMOpt(int[] num, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            int cur = num[i];
            //cur + x = target
            //x = target - cur
            int x = target - cur;
            if (map.containsKey(x)){
                return new int[] {map.get(x), i};
            }
            map.put(cur,i);
        }
        return new int[] {};
    }
}
