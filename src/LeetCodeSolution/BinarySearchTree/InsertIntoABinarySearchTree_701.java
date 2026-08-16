package LeetCodeSolution.BinarySearchTree;

public class InsertIntoABinarySearchTree_701 {
    public TreeNode insertIntoBST(TreeNode root, int target) {
        if (root == null) return new TreeNode(target);
        if (root.val > target) root.left = insertIntoBST(root.left, target); // target belongs to the left subtree
        else root.right = insertIntoBST(root.right, target); // target belongs to the right subtree
        return root;
    }
}


