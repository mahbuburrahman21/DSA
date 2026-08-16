package LeetCodeSolution.BinaryTree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal_106_apr2 {
    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        indexMap = new HashMap<>();

        // Store each value's index in inorder
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }

        int n = inorder.length;
        return build(0, n - 1, 0, n - 1, postorder);
    }

    private TreeNode build(int inLo, int inHi, int poLo, int poHi, int[] postorder) {

        // No nodes in this subtree
        if (inLo > inHi || poLo > poHi) {
            return null;
        }

        // Last element of postorder is root
        int val = postorder[poHi];
        TreeNode root = new TreeNode(val);

        // O(1) lookup instead of O(n) search
        int r = indexMap.get(val);

        // Number of nodes in left subtree
        int leftSize = r - inLo;

        root.left = build(inLo, r - 1, poLo, poLo + leftSize - 1, postorder);
        root.right = build(r + 1, inHi, poLo + leftSize, poHi - 1, postorder);

        return root;
    }
}


