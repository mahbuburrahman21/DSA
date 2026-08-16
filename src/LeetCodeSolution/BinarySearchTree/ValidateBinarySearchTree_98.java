package LeetCodeSolution.BinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class ValidateBinarySearchTree_98 {
    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        storeTheTree(root, list);

        return isSorted(list);
    }

    private void storeTheTree(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;
        storeTheTree(root.left, list);
        list.add(root.val);
        storeTheTree(root.right, list);
    }

    private boolean isSorted(ArrayList<Integer> list) {
        if (list == null || list.size() <= 1) {
            return true;
        }
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) >= list.get(i+1)) return false;
        }
        return true;
    }
}
