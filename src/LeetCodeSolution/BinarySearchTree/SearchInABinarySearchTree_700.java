package LeetCodeSolution.BinarySearchTree;

public class SearchInABinarySearchTree_700 {
    public TreeNode searchBST(TreeNode root, int target) {
        TreeNode temp = root;

        while(temp != null){
            if(temp.val == target) return temp;

            if(temp.val > target) temp = temp.left;
            else temp = temp.right;
        }

        return null;
    }
}
