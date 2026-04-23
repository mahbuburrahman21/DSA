package BinaryTrees;

import java.util.*;

class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val = val;
    }
}
class Pair{
    int level;
    Node node;
    Pair(Node node, int level){
        this.node = node;
        this.level = level;
    }
}

public class Implementation {
    static void main() {
        //           3          -----a
        //        /     \
        //      4        2      -----b    c
        //    /   \    /   \
        //  -1    1   6     9   -----d    e    f    g
        Node a = new Node(3); //root node
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        display(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(productNonZero(a));
        System.out.println(max(a));
        System.out.println(level(a));
        BFS_traversal(a);
        BFS_traversalAdvance(a);
        int k = 2;
        int level=1;
        kThLevel(a,level,k);
        System.out.println(levelOrder(a));
        System.out.println(zigzagLevelOrder(a));
        System.out.println(Paths(a));
    }

    private static void kThLevel(Node root, int level, int k) {
        if (root == null) return;
        if(level==k) System.out.print(root.val+" ");
        kThLevel(root.left, level+1, k);
        kThLevel(root.right, level+1, k);
    }
    //Leetcode: 102
    private static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root==null) return list;
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node node = q.remove();
                level.add(node.val);
                if(root.left != null) q.add(root.left);
                if(root.right != null) q.add(root.right);
            }
            list.add(level);
        }
        return list;
    }
    //Leetcode: 103
    private static List<List<Integer>> zigzagLevelOrder(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int flag = 1;

        while (!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int n = q.size();
            for (int i = 0; i < n; i++) {
                Node node = q.remove();
                level.add(node.val);
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            if (flag % 2 == 0) Collections.reverse(level);
            flag++;
            list.add(level);
        }
        return list;
    }

    private static void BFS_traversal(Node root){
        Queue<Node> q = new LinkedList<>();
        Node temp = root;
        q.add(temp);
        while (!q.isEmpty()){
            if(temp.left != null) q.add(temp.left);
            if(temp.right != null) q.add(temp.right);
            System.out.print(q.remove().val+" ");
            temp = q.peek();
        }
        System.out.println();
    }
    //To get enter after every level
    //  3
    //  4  2
    // -1  1  6  9
    private static void BFS_traversalAdvance(Node root){
        Queue<Pair> q = new LinkedList<>();
        int currLevel = 1;
        q.add(new Pair(root, currLevel));
        while (!q.isEmpty()){
            Pair front = q.remove();
            Node node = front.node;
            int level = front.level;
            if (level != currLevel) {
                currLevel++;
                System.out.println();
            }
            System.out.print(node.val+" ");
            if(node.left != null) q.add(new Pair(node.left, currLevel+1));
            if(node.right != null) q.add(new Pair(node.right, currLevel+1));
        }
        System.out.println();
    }

    private static int level(Node root) {
        if (root == null) return 0;
        int leftLevel = level(root.left);
        int rightLevel = level(root.right);
        return 1+Math.max(leftLevel, rightLevel);
    }

    private static int max(Node root) {
        if (root == null) return Integer.MIN_VALUE;

        int leftMax = max(root.left);
        int rightMax = max(root.right);
        //Compare between  all(root, left, right) element of the tree.
        //Return the max among them.
        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    private static int product(Node root) {
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }

    private static int productNonZero(Node root) {
        if(root == null) return 1;
        int leftProduct = productNonZero(root.left);
        int rightProduct = productNonZero(root.right);

        if(root.val == 0) return leftProduct * rightProduct;
        return root.val * leftProduct * rightProduct;
    }

    private static int sum(Node root) {
        if (root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    private static int size(Node root) {
        if(root == null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    private static void display(Node root) {
        if(root == null) return;

        //This three line can be swapped in 3! = 6 ways.
        //Then the printing will be in different order in every way of execution.
        System.out.print(root.val+" ");
        display(root.left); // This will print all the value from left of the root
        display(root.right); // This will print all the value from right of the root
    }

    //All root to leaf paths:
    private static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        rootToLeaf(ans, root, list);
        return ans;
    }
    private static void rootToLeaf(ArrayList<ArrayList<Integer>> ans, Node root, ArrayList<Integer> list) {
        if (root==null) return;
        list.add(root.val);
        if(root.left==null && root.right==null){
            ArrayList<Integer> copy = new ArrayList<>(list);
            ans.add(copy);
        }
        rootToLeaf(ans, root.left, list);
        rootToLeaf(ans, root.right, list);
        list.removeLast();
    }
}
