package LeetCodeSolution.BinaryTree;

import java.util.ArrayList;

public class BinaryTreeBoundaryTraversal_gfg {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return ans;
        }
        ans.add(root.data);
        leftBoundary(root.left, ans);
        leafNodeBoundary(root, ans);
        rightBoundary(root.right, ans);
        return ans;
    }

    //Adding the left boundary
    private void leftBoundary(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        ans.add(root.data);
        if (root.left != null) leftBoundary(root.left, ans);
        else leftBoundary(root.right, ans);
    }

    //Adding the leaf Node boundary
    private void leafNodeBoundary(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        if (root.left == null && root.right == null) ans.add(root.data);
        leafNodeBoundary(root.left, ans);
        leafNodeBoundary(root.right, ans);
    }

    //Adding the right boundary
    private void rightBoundary(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        if (root.left == null && root.right == null) return;
        if (root.right != null) rightBoundary(root.right, ans);
        else rightBoundary(root.left, ans);
        ans.add(root.data);
    }
}






