package LeetCodeSolution.GeneralProblem;

public class SearchA2DMatrix_II_240 {
    static void main() {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        //int[][] matrix = {{1,4},{2,5}};
        //int potentialRow = findingPotentialRow(matrix, 20);
        //System.out.println(potentialRow);
        boolean isFound = searchMatrix(matrix,  33);
        if (isFound) System.out.println("Target found!");
        else System.out.println("Target not found!");
    }


    public static boolean searchMatrix(int[][] arr, int target){
        int row = arr.length;
        int col = arr[0].length;
        int i = 0;
        int j = col-1;
        while (i < row && j >= 0){
            //System.out.println("Element which compared: "+arr[i][j]);
            if (arr[i][j] == target) return true;
            else if (arr[i][j] > target) j--; //move left
            else i++; //move down
        }
        return false;
    }
}
