/*
 * Problem : Lowest Common Ancestor of a Binary Tree
 * LeetCode: https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
 * GFG     : https://www.geeksforgeeks.org/lowest-common-ancestor-binary-tree-set-1/
 *
 * Approach (single traversal):
 * Recursively search both subtrees. If the current node is null or matches n1/n2,
 * return it. If both recursive calls return a non-null node, the current node is
 * the LCA. Otherwise return whichever result is non-null.
 *
 * Time : O(n) | Space : O(h)
 */
public class LCAapproachII {
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

    public static Node LCA2(Node root , int n1 , int n2){
        if(root == null){
            return null;
        }
        if(root.data==n1 || root.data==n2){
            return root;
        }

        Node leftLCA= LCA2(root.left, n1, n2);
        Node rightLCA = LCA2(root.right, n1, n2);
        if(rightLCA==null){
            return leftLCA;
        }

        if(leftLCA ==null){
            return rightLCA;
        }

        return root;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(LCA2(root, 4, 5).data);    
    } 


}
