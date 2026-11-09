/*
 * Problem : Maximum Depth of Binary Tree / Diameter of Binary Tree
 * LeetCode: https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * LeetCode: https://leetcode.com/problems/diameter-of-binary-tree/
 * GFG     : https://www.geeksforgeeks.org/diameter-of-a-binary-tree/
 *
 * Approach:
 * - height: 1 + max(height(left), height(right)).
 * - diameter: the longest path through a node is leftHeight + rightHeight + 1;
 *   the answer is the maximum over all nodes.
 * This file recomputes height at every node (O(n^2)); it can be optimized to
 * O(n) by returning height and diameter together (see widthTree.java).
 *
 * Time : O(n^2) for the current diameter | Space : O(h)
 */
public class heightTree {
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

    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftDiam = diameter(root.left);
        int leftHt = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHt = height(root.right);

        int selfDiam = leftHt+rightHt+1;

        return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
    }

    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        int ht = Math.max(lh, rh)+1;
        return ht;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
        System.out.println(diameter(root));
    }
}
