package LeetCodeSolution.BinaryTree;

import java.util.Arrays;

public class ConstructBinarySearchTreeFromPreorderTraversal_1008 {

    //We know, inorder = sorted preorder
    public TreeNode bstFromPreorder(int[] preorder) {
        int size = preorder.length;
        int[] inorder = Arrays.copyOf(preorder, size);
        Arrays.sort(inorder);
        return buildTree(preorder, inorder);

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        return build(0,n-1, 0,n-1, preorder, inorder);
    }

    public TreeNode build(int preLo, int preHi, int inLo, int inHi, int[] preorder, int[] inorder ){
        if (preLo > preHi) return null;
        int val = preorder[preLo];
        TreeNode root = new TreeNode(val);
        int r = -1;
        for (int i = inLo; i <= inHi ; i++) { // finding root in inorder
            if (inorder[i] == val){
                r = i;
                break;
            }
        }
        int count = r-inLo; // Number of element in LST
        root.left = build(preLo+1, preLo+count, inLo, r-1, preorder, inorder);
        root.right = build(preLo+count+1, preHi, r+1, inHi, preorder, inorder);
        return root;
    }
}

