/*
 * Problem : Diameter of a Binary Tree (optimized, one pass)
 * LeetCode: https://leetcode.com/problems/diameter-of-binary-tree/
 * GFG     : https://www.geeksforgeeks.org/diameter-of-a-binary-tree/
 *
 * Approach:
 * A post-order DFS returns both the height and the diameter of every subtree in
 * one pass. The diameter through the current node is
 * leftHeight + rightHeight + 1, and the overall diameter is the maximum of the
 * left diameter, the right diameter and the diameter through the current node.
 *
 * Time : O(n) | Space : O(h)
 */
public class widthTree {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            this.left =null;
            this.right = null;
        }
    }
    static class Info{
        int diam ;
        int ht;

        public Info(int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht+1);
        int ht =Math.max(leftInfo.ht, rightInfo.ht)+1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println();
        System.out.println(diameter(root).diam);
    }
}
