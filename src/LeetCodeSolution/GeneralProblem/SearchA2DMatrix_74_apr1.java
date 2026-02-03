package LeetCodeSolution.GeneralProblem;

public class SearchA2DMatrix_74_apr1 {
    static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60},{70,71,74,76}};
        //int potentialRow = findingPotentialRow(matrix, 20);
        //System.out.println(potentialRow);
        boolean isFound = searchMatrix(matrix, 35);
        if (isFound) System.out.println("Target found!");
        else System.out.println("Target not found!");
    }

    //O(log(m)) time complexity to find the potential row.
    public static int findingPotentialRow(int[][] matrix, int target){
        int start = 0;
        int end = matrix.length-1;
        int lastCol = matrix[0].length-1;
        int potentialAns = -1;

        while (start <= end){
            int mid = start + (end-start)/2; // mid is the row number here.

            if (matrix[mid][lastCol] == target) return mid;
            else if (matrix[mid][lastCol] < target) start = mid+1;
            else if (matrix[mid][lastCol] > target) {
                end = mid-1;
                potentialAns = mid;
            }
        }
        return potentialAns;
    }

    //O(log(n)) time complexity to find the potential target in the row.
    public static boolean searchMatrix(int[][] matrix, int target){
        int searchRow = findingPotentialRow(matrix,target);
        if(searchRow == -1) return false;
        int start = 0;
        int end = matrix[0].length-1;

        while (start <= end){
            int mid = start+(end-start)/2; // mid is the col number here.

            if (matrix[searchRow][mid] == target) return true;
            else if (matrix[searchRow][mid] < target) start = mid+1;
            else if (matrix[searchRow][mid] > target) end = mid-1;
        }
        return false;
    }
    //Total Time Complexity = O(log(m*n))
}
