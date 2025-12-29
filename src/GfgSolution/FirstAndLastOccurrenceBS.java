package GfgSolution;

import java.util.ArrayList;

public class FirstAndLastOccurrenceBS {
    static void main(String[] args) {

    }
    ArrayList<Integer> find(int arr[], int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);
        int st = 0;
        int end = arr.length-1;
        while (st <= end){
            int mid = st+(end-st)/2;
            if (target > arr[mid]){
                st = mid+1;
            } else if (target < arr[mid]) {
                end = mid-1;
            } else if (target == arr[mid]) {
                while(mid>st){ // Return the lowest index if multiple occurrence happen.
                    if(arr[mid-1]==arr[mid]){
                        mid--;
                    }else break;
                }
                ans.set(0,mid);
                //arr[0] = mid;

                while(mid<end){ // Return the Highest index if multiple occurrence happen.
                    if(arr[mid+1]==arr[mid]){
                        mid++;
                    }else break;
                }
                ans.set(1,mid);
                //arr[1] = mid;
                return ans;
            }
        }
        return ans;
    }
}
