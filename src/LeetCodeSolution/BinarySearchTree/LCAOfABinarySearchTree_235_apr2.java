package LeetCodeSolution.BinarySearchTree;

public class LCAOfABinarySearchTree_235_apr2 {
    //Iterative approach. O(1) extra space solution.
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        while(true){
            if(curr.val < p.val && curr.val < q.val) curr = curr.right; // go right
            else if(curr.val > p.val && curr.val > q.val) curr = curr.left; // go left
            else if(curr.val == p.val) return p;
            else if (curr.val == q.val) return q;
            else return curr;
        }
    }
}
