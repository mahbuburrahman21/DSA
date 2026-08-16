package LeetCodeSolution.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal_144 {
    //Preorder Traversal iterative method
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        if(root.left == null && root.right == null) {
            list.add(root.val);
            return list;
        }
        Stack<TreeNode> st = new Stack<>();
        st.add(root);
        while (!st.isEmpty()){
            TreeNode top = st.pop();
            int val = top.val;
            list.add(val);
            if (top.right != null) st.push(top.right);
            if (top.left != null) st.push(top.left);
        }
        return list;
    }
}
