package LeetCodeSolution;

public class SearchA2DMatrix_74_apr2 {
    static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60},{70,71,74,76}};
        //int potentialRow = findingPotentialRow(matrix, 20);
        //System.out.println(potentialRow);
        boolean isFound = searchMatrix(matrix, 5);
        if (isFound) System.out.println("Target found!");
        else System.out.println("Target not found!");
    }

    //O(log(m*n)) time complexity.
    public static boolean searchMatrix(int[][] matrix, int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        //Calculating the number of row and column
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0; // first index in virtual array
        int end = m*n-1; // last index in virtual array

        while (start <= end){
            int mid = start+(end-start)/2;
            int row = mid/n;
            int col = mid%n;
            int value = matrix[row][col];

            if (value == target) return true;
            else if (value < target) start = mid+1;
            else end = mid-1;
        }
        return false;
    }
}
