package LeetCodeSolution.GeneralProblem;
import java.util.ArrayList;
import java.util.List;
public class GenerateParentheses_22 {
    static void main() {
        System.out.println(generateParenthesis(4));
    }
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        helper("",list,0,0,n);
        //System.out.println(list);
        return list;
    }
    public static void helper(String s,List<String> list, int leftCount, int rightCount,int n){
        if (rightCount == n) {
            list.add(s);
            return;
        }
        if (leftCount < n) helper(s+"(", list,leftCount+1,rightCount,n);
        if(leftCount > rightCount) helper(s+")", list,leftCount,rightCount+1,n);
    }
}
