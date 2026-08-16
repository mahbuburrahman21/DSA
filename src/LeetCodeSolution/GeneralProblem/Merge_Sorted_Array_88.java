package LeetCodeSolution.GeneralProblem;

public class Merge_Sorted_Array_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedArr = new int[m + n];
        int arrSize = mergedArr.length;

        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(nums1[i] < nums2[j]) mergedArr[k++] = nums1[i++];
            else mergedArr[k++] = nums2[j++];
        }

        while(i<m) mergedArr[k++] = nums1[i++];
        while(j<n) mergedArr[k++] = nums2[j++];

        // Copy the merged result back into nums1
        for (int x = 0; x < m + n; x++) {
            nums1[x] = mergedArr[x];
        }
    }
}
