package LeetCodeSolution.BinaryTree;

public class FlattenBinaryTreeToLinkedList_114_apr2 {
    public void flatten(TreeNode root) {
        if (root == null) return;
        TreeNode LST = root.left;
        TreeNode RST = root.right;
        root.left = null;
        root.right = null;
        flatten(LST);
        flatten(RST);
        root.right = LST;
        TreeNode temp = root;
        while (temp.right != null) temp =temp.right;
        temp.right = RST;
    }
}
