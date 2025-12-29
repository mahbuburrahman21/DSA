package GfgSolution;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] a={3,1,2,1,1,4,5,5};
        int[] b={6,1,1,4,4,2,8};
        int n=a.length;
        int m=b.length;
        Arrays.sort(a); // O(nlog(n))
        Arrays.sort(b); // O(mlog(n))
        int i = 0;
        int j = 0;
        while (i<n && j<m){ // O(m+n)
            if (a[i]== b[j]){
                ans.add(a[i]);
                i++;
                j++;
            } else if (a[i]<b[j]) {
                i++;
            } else j++;
        }
        System.out.println(ans);
    }
}
