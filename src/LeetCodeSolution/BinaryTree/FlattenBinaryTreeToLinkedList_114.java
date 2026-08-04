package LeetCodeSolution.BinaryTree;

import java.util.ArrayList;

public class FlattenBinaryTreeToLinkedList_114 {
    public void flatten(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return;
        ArrayList<TreeNode> list = new ArrayList<>();
        helper(root, list);

        TreeNode temp = root;

        for (int i = 1; i < list.size(); i++) {
            temp.right = list.get(i);
            temp.left = null;
            temp = temp.right;
        }
    }

    public void helper(TreeNode root, ArrayList<TreeNode> list){
        if (root == null) return;
        list.add(root);
        helper(root.left, list);
        helper(root.right, list);
    }
}
