/*
 * Problem : Search in a Binary Search Tree
 * LeetCode: https://leetcode.com/problems/search-in-a-binary-search-tree/
 * GFG     : https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
 *
 * Approach:
 * Compare the key with the current node: if equal return true, if smaller recurse
 * into the left subtree, otherwise recurse into the right subtree. Reaching null
 * means the key is not present.
 *
 * Time : O(h) | Space : O(h)
 */
package BinarySearchTree;

public class SearchBST {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
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

    public static boolean search(Node root , int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(root.data>key){
            return search(root.left, key);
        }

        else{
            return search(root.right, key);
        }

    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        if(search(root, 1)){
            System.out.println("found");
        }else{
            System.out.println("nf");
        }

    }
}
