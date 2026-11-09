/*
 * Problem : Largest BST in a Binary Tree
 * GFG     : https://www.geeksforgeeks.org/largest-bst-binary-tree-set-2/
 * Related : https://leetcode.com/problems/largest-bst-subtree/
 *
 * Approach:
 * A post-order DFS returns an Info object for every subtree containing:
 * - isBST : whether the subtree is a valid BST
 * - size  : number of nodes in the subtree
 * - min   : minimum value in the subtree
 * - max   : maximum value in the subtree
 * A subtree is a BST if both children are BSTs and
 * left.max < root.data < right.min. The answer is the maximum size among all
 * valid BST subtrees. (The implementation in this file is incomplete.)
 *
 * Time : O(n) | Space : O(h)
 */
public class SizeofLagrestBT {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        boolean isBST;
        int size;
        int min;
        int max;
        public Info(boolean isBST , int size, int min , int max){
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static Info largestBST(Node root){
        Info leftInfo = largestBST(root.left);
        Info rightInfo = 
    }
    public static void main(String[]args){
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);
    }
}
