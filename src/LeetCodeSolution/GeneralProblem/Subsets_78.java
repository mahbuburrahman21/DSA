package LeetCodeSolution.GeneralProblem;

import java.util.ArrayList;
import java.util.List;

public class Subsets_78 {
    static void main() {

    }
    public void subset(List<Integer> ans, int[] nums, int idx, List<List<Integer>> list) {
        if (idx == nums.length) {
            list.add(new ArrayList<>(ans)); // copy current subset
            return;
        }

        // Pick
        ans.add(nums[idx]);
        subset(ans, nums, idx + 1, list);

        // Backtrack
        ans.removeLast();

        // Skip
        subset(ans, nums, idx + 1, list);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        subset(new ArrayList<>(), nums, 0, list);
        return list;
    }
}
