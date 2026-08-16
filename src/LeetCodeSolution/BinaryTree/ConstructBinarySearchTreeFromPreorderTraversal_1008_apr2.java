package LeetCodeSolution.BinaryTree;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConstructBinarySearchTreeFromPreorderTraversal_1008_apr2 {
    private Map<Integer, Integer> inOrderIndex;

    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;

        // Inorder of a BST is sorted.
        int[] inorder = Arrays.copyOf(preorder, n);
        Arrays.sort(inorder);

        // Store the index of every value in inorder.
        inOrderIndex = new HashMap<>();

        for (int i = 0; i < n; i++) {
            inOrderIndex.put(inorder[i], i);
        }

        return build(0, n - 1, 0, n - 1, preorder, inorder);
    }

    private TreeNode build(int preLo, int preHi, int inLo, int inHi, int[] preorder, int[] inorder) {
        if (preLo > preHi) return null;


        int val = preorder[preLo];
        TreeNode root = new TreeNode(val);

        // O(1) average lookup instead of O(n) search.
        int r = inOrderIndex.get(val);

        int leftSize = r - inLo;

        root.left = build(preLo + 1, preLo + leftSize, inLo, r - 1, preorder, inorder);

        root.right = build(preLo + leftSize + 1, preHi, r + 1, inHi, preorder, inorder);

        return root;
    }
}



