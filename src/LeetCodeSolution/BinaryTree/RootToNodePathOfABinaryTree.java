package LeetCodeSolution.BinaryTree;

import java.util.ArrayList;

public class RootToNodePathOfABinaryTree {

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







