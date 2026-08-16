package LeetCodeSolution.BinaryTree;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal_106 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0, n-1, 0, n-1, inorder, postorder);
    }
    private TreeNode build(int inLo, int inHi, int poLo, int poHi, int[] inorder, int[] postorder){

        if (inLo > inHi || poLo > poHi) return null;

        //Last element of postorder in the root
        int val = postorder[poHi];
        TreeNode root = new TreeNode(val);

        // finding the root in inorder
        int r = 0;
        for (int i = inLo; i <=inHi ; i++) {
            if (inorder[i] == val){
                r = i;
                break;
            }
        }

        // Number of nodes in left subtree
        int count = r - inLo;

        root.left = build(inLo, r-1, poLo, poLo+count-1, inorder, postorder);
        root.right = build(r+1, inHi, poLo+count+1, poHi-1, inorder, postorder);
        return root;
    }
}
