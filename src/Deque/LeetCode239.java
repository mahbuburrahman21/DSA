package Deque;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class LeetCode239 {
    public static int[] maxSlidingWindow(int[] arr, int k) {
        if(arr.length == 1) return arr;
        int n = arr.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> dq = new ArrayDeque<>();

        // Step1: deque setup
        for(int i=0; i<k; i++){
            if(dq.isEmpty() || arr[dq.getLast()] > arr[i]) dq.addLast(i);
            else{
                while (!dq.isEmpty() && arr[dq.getLast()] <= arr[i]) dq.removeLast();
                dq.addLast(i);
            }
        }

        // Step2: loop to find max
        int l=0;
        int r=l+k-1;
        int ansIdx = 0;
        while(r<n){
            ans[ansIdx] = arr[dq.getFirst()];
            l++;
            if(dq.getFirst() < l) dq.removeFirst();
            r++;
            if (r<n){
                while (!dq.isEmpty() && arr[dq.getLast()] <= arr[r]) dq.removeLast();
                dq.addLast(r);
            }
            ansIdx++;
        }
        return ans;
    }


    static void main() {
        //int[] arr = {1,3,-1,-3,5,3,6,7};
        int[] arr = {2,7,3,1,6,2,5,8,1,4};
        System.out.println(Arrays.toString(maxSlidingWindow(arr, 4)));
    }
}
