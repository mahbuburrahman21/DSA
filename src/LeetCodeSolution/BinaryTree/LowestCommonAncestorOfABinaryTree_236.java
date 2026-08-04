package LeetCodeSolution.BinaryTree;


public class LowestCommonAncestorOfABinaryTree_236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null) return null;
        if(root == p || root == q) return root;
        boolean pLiesInLeft = exists(root.left, p);
        boolean qLiesInRight = exists(root.right, q);

        if (pLiesInLeft && !qLiesInRight) return lowestCommonAncestor(root.left, p,q);
        else if (!pLiesInLeft && qLiesInRight) return lowestCommonAncestor(root.right, p, q);
        else return root;
    }

    private boolean exists(TreeNode root, TreeNode node){
        if (root==null) return false;
        if (root == node) return true;
        return exists(root.left, node) || exists(root.right, node);
    }
}
