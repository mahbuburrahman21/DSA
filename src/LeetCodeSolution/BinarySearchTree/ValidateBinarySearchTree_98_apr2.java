package LeetCodeSolution.BinarySearchTree;

public class ValidateBinarySearchTree_98_apr2 {

    public boolean isValidBST(TreeNode root) {
        return checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean checkBST(TreeNode root, long mn, long mx) {
        if (root == null) {
            return true;
        }

        // root.val must be strictly between mn and mx
        if (!(root.val > mn && root.val < mx)) {
            return false;
        }

        boolean left = checkBST(root.left, mn, root.val);

        if (!left) {
            return false;
        }

        boolean right = checkBST(root.right, root.val, mx);

        return right;
    }
}
