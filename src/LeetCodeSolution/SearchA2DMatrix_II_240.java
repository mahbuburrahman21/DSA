package LeetCodeSolution;

public class SearchA2DMatrix_II_240 {
    static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60},{70,71,74,76}};
        //int[][] matrix = {{1,4},{2,5}};
        //int potentialRow = findingPotentialRow(matrix, 20);
        //System.out.println(potentialRow);
        boolean isFound = searchMatrix(matrix,  30);
        if (isFound) System.out.println("Target found!");
        else System.out.println("Target not found!");
    }


    public static boolean searchMatrix(int[][] matrix, int target){
        int row = 0;
        int loop = matrix.length;

        for (int i = 0; i < loop; i++) {
            int start = 0;
            int end = matrix[0].length-1;
            while (start <= end){
                int mid = start+(end-start)/2; // mid is the col number here.

                if (matrix[row][mid] == target) return true;
                else if (matrix[row][mid] < target) start = mid+1;
                else if (matrix[row][mid] > target) end = mid-1;
            }
            row++;
            System.out.println("Not found");
        }

        return false;
    }
    //Total Time Complexity = O(mlog(n))
}
