package LeetCodeSolution.BinarySearchTree;

import java.util.ArrayList;

public class KthSmallestElementInABST_230 {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        helper(root, arr);
        return arr.get(k-1);
    }

    public void helper(TreeNode root, ArrayList<Integer> arr){
        if(root == null) return;
        helper(root.left, arr);
        arr.add(root.val);
        helper(root.right, arr);
    }
}
