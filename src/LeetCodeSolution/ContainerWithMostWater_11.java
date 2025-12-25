package LeetCodeSolution;

public class ContainerWithMostWater_11 {
    static void main(String[] args) {
        //int[] height = {1,8,6,2,5,4,8,3,7};
        //int[] height = {1,2};
        //int[] height = {1,2,1};
        int[] height = {2,3,4,5,18,17,6};
        int max =  maxArea(height);
        System.out.println(max);
    }
    public static int maxArea(int[] height) {
        int n = height.length; // length of the array
        int maxArea = 0;
        int i =0, j=n-1;
        while (i<j){
            int b = j-i;
            int h = Math.min(height[i], height[j]);
            int currentArea = b*h;

            if (currentArea > maxArea)  maxArea =currentArea;

            System.out.printf("i -> %d\nj -> %d\n\n",i,j);
            if (height[i]<height[j]) i++;
            else j--;
        }
        return maxArea;
    }
}
