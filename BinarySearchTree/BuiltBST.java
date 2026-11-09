/*
 * Problem : Insert into a Binary Search Tree / Build a BST
 * LeetCode: https://leetcode.com/problems/insert-into-a-binary-search-tree/
 * GFG     : https://www.geeksforgeeks.org/insertion-in-binary-search-tree/
 *
 * Approach:
 * Recursively insert each value. If the current node is null, create a new node.
 * If val < node.data go left, otherwise go right. An inorder traversal of the
 * resulting tree prints the values in sorted order.
 *
 * Time : O(h) per insert (h = height) | Space : O(h)
 */
package BinarySearchTree;

public class BuiltBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            
        }
    }

    public static Node insert(Node root,  int val){ //will return root
        if(root==null){
            root = new Node(val);
            return root;
        }

        if(root.data>val){
            root.left = insert(root.left,val);
        }else{
            root.right = insert(root.right,val);
        }

        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        inorder(root);
    }

}
 