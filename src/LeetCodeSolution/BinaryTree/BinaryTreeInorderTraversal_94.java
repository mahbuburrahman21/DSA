package LeetCodeSolution.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode current = root;

        while (current != null || !st.isEmpty()){
            if (current!=null){
                if (current.left != null){
                    st.push(current);
                    current = current.left;
                } else {
                    ans.add(current.val);
                    current = current.right;
                }
            }
            else { // current == null
                TreeNode top = st.pop();
                ans.add(top.val);
                current = top.right;
            }
        }
        return ans;
    }
}


