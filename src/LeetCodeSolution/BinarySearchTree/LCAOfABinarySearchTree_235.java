package LeetCodeSolution.BinarySearchTree;

public class LCAOfABinarySearchTree_235 {
    // Recursive solution with O(h) stack space
    // Time complexity is O(h) ----> h is the tree height here
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val < p.val && root.val < q.val)
            return lowestCommonAncestor(root.right, p, q);
        else if(root.val > p.val && root.val > q.val)
            return lowestCommonAncestor(root.left, p, q);
        else
            return root;
    }
}
