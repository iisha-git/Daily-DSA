/*
 * Problem : Invert / Mirror Binary Tree
 * LeetCode: https://leetcode.com/problems/invert-binary-tree/
 * GFG     : https://www.geeksforgeeks.org/create-a-mirror-tree-from-the-given-binary-tree/
 *
 * Approach:
 * Recursively mirror the left and right subtrees, then swap the left and right
 * pointers of the current node. Doing this for every node produces the mirror
 * image of the tree.
 *
 * Time : O(n) | Space : O(h)
 */
package BinarySearchTree;

public class reverseTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node mirrorTree(Node root){
        if(root == null){
            return null;
        }
        Node leftT = mirrorTree(root.left);
        Node rightT = mirrorTree(root.right);

        root.left = rightT;
        root.right = leftT;
        
        return root;
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
    if(root == null) return;

    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}

    public static void main(String [] args){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        mirrorTree(root);

        System.out.print("\nInorder after mirror: ");
        inorder(root);
    }
}
