package LeetCodeSolution.BinaryTree;

import java.util.ArrayList;

//This problem is in GFG
public class MinDistanceBetweenTwoGivenNodesOfABinaryTree {
    public int minDiffInBST(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode LCA = lowestCommonAncestor(root, p, q);
        ArrayList<TreeNode> pList = rootToNodePath(LCA, p);
        ArrayList<TreeNode> qList = rootToNodePath(LCA, q);
        return pList.size() + qList.size() - 2;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left == null) return right;
        if (right == null) return left;
        return root;
    }

    public ArrayList<TreeNode> rootToNodePath(TreeNode root, TreeNode target){
        ArrayList<TreeNode> ans = new ArrayList<>();
        if(root == null) return ans;
        helper(root, ans, target);
        return ans;
    }

    private Boolean helper(TreeNode root, ArrayList<TreeNode> ans,TreeNode target) {
        if (root == null) return false;
        ans.add(root);
        if (root == target) return true;
        if(helper(root.left, ans, target) || helper(root.right, ans, target)) return true;
        ans.removeLast();
        return false;
    }
}
