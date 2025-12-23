package LeetCodeSolution;

import java.util.ArrayList;
import java.util.List;
public class FizzBuzz_412 {
    static void main(String[] args) {
        List<String> FB= fizzBuzz(15);
        System.out.println(FB);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
//            if (i % 15 == 0) {
//                ans.add("LeetCodeSolution.FizzBuzz");
//            } else if (i % 3 == 0) {
//                ans.add("Fizz");
//            } else if (i % 5 == 0) {
//                ans.add("Buzz");
//            } else {
//                ans.add(String.valueOf(i));
//            }
            String value =
                    (i % 3 == 0 && i % 5 == 0) ? "LeetCodeSolution.FizzBuzz" :
                            (i % 3 == 0) ? "Fizz" :
                                    (i % 5 == 0) ? "Buzz" :
                                            String.valueOf(i);
            ans.add(value);
        }
        return ans;
    }
}
